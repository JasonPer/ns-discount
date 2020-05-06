package org.jasonper.discountportal.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.jasonper.discountcommon.exception.Asserts;
import org.jasonper.discountmbg.mapper.PlayerBasesMapper;
import org.jasonper.discountmbg.model.PlayerBases;
import org.jasonper.discountmbg.model.PlayerBasesExample;
import org.jasonper.discountportal.domain.PlayerDetail;
import org.jasonper.discountportal.service.PlayerBasesCacheService;
import org.jasonper.discountportal.service.PlayerBasesService;
import org.jasonper.discountsecurity.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 9:49
 * @description 玩家信息Service实现类
 */
@Service
public class PlayerBasesServiceImpl implements PlayerBasesService, UserDetailsService {
    private static final Logger LOGGER = LoggerFactory.getLogger(PlayerBasesServiceImpl.class);
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Autowired
    private PlayerBasesMapper basesMapper;
    @Autowired
    private PlayerBasesCacheService basesCacheService;
    @Value("${redis.key.authCode}")
    private String REDIS_KEY_PREFIX_AUTH_CODE;
    @Value("${redis.expire.authCode}")
    private Long AUTH_CODE_EXPIRE_SECONDS;

    @Override
    public PlayerBases getByPlayerName(String playerName) {
        PlayerBases playerBases = basesCacheService.getPlayer(playerName);
        if (playerBases != null){
            return playerBases;
        }
        PlayerBasesExample example = new PlayerBasesExample();
        example.createCriteria().andPlayerNameEqualTo(playerName);
        List<PlayerBases> playerBasesList = basesMapper.selectByExample(example);
        if (!CollectionUtil.isEmpty(playerBasesList)){
            playerBases = playerBasesList.get(0);
            basesCacheService.setPlayer(playerBases);
            return playerBases;
        }
        return null;
    }

    @Override
    public PlayerBases getById(Long id) {
        return basesMapper.selectByPrimaryKey(id);
    }

    @Override
    public void register(String playerName, String password, String phone, String authCode) {
        //验证验证码
        if (!verifyAuthCode(authCode, phone)){
            Asserts.fail("验证码错误");
        }
        //查询是否有该玩家
        PlayerBasesExample example = new PlayerBasesExample();
        example.createCriteria().andPlayerNameEqualTo(playerName);
        example.or(example.createCriteria().andPhoneEqualTo(phone));
        List<PlayerBases> playerBasesList = basesMapper.selectByExample(example);
        if (!CollectionUtil.isEmpty(playerBasesList)){
            Asserts.fail("该玩家已注册");
        }
        //没有玩家则进行添加操作
        PlayerBases playerBases = new PlayerBases();
        playerBases.setPlayerName(playerName);
        playerBases.setPhone(phone);
        playerBases.setPassword(passwordEncoder.encode(password));
        playerBases.setCreateTime(new Date());
        playerBases.setIntegral(String.valueOf(0));
        basesMapper.insert(playerBases);
        playerBases.setPassword(null);
    }

    @Override
    public String generateAuthCode(String phone) {
        //生成6位随机验证码
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i=0;i<6;i++){
            sb.append(random.nextInt(10));
        }
        basesCacheService.setAuthCode(phone, sb.toString());
        //发送短信验证码
//        sendMessage(phone, sb.toString());
        return sb.toString();
    }

    @Override
    public void updatePassword(String phone, String password, String authCode) {
        PlayerBasesExample example = new PlayerBasesExample();
        example.createCriteria().andPhoneEqualTo(phone);
        List<PlayerBases> playerBasesList = basesMapper.selectByExample(example);
        if (CollectionUtil.isEmpty(playerBasesList)){
            Asserts.fail("该账号不存在");
        }
        //验证验证码
        if (!verifyAuthCode(authCode, phone)){
            Asserts.fail("验证码错误");
        }
        PlayerBases playerBases = playerBasesList.get(0);
        playerBases.setPassword(passwordEncoder.encode(password));
        basesMapper.updateByPrimaryKeySelective(playerBases);
        basesCacheService.delPlayer(playerBases.getId());
    }

    @Override
    public PlayerBases getCurrentPlayer() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication auth = context.getAuthentication();
        PlayerDetail playerDetail = (PlayerDetail) auth.getPrincipal();
        return playerDetail.getPlayerBases();
    }

    @Override
    public void updateIntegration(Long id, Integer integration) {
        PlayerBases playerBases = new PlayerBases();
        playerBases.setId(id);
        playerBases.setIntegral(String.valueOf(integration));
        basesMapper.updateByPrimaryKeySelective(playerBases);
        basesCacheService.delPlayer(id);
    }

    @Override
    public UserDetails loadUserByUsername(String playerName) {
        PlayerBases playerBases = getByPlayerName(playerName);
        if (playerBases != null){
            return new PlayerDetail(playerBases);
        }
        throw new UsernameNotFoundException("用户名或者密码错误");
    }

    @Override
    public String login(String username, String password) {
        String token = null;
        //密码需要客户端加密后传递
        try {
            UserDetails playerDetails = loadUserByUsername(username);
            if (!passwordEncoder.matches(password, playerDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(playerDetails, null, playerDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token = jwtTokenUtil.generateToken(playerDetails);
        }catch (AuthenticationException e){
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }

    @Override
    public String refreshToken(String token) {
        return jwtTokenUtil.refreshHeadToken(token);
    }

    /**
     * 对输入的验证码进行校验
     * @param authCode
     * @param phone
     * @return
     */
    private boolean verifyAuthCode(String authCode, String phone){
        if (StringUtils.isEmpty(authCode)){
            return false;
        }
        String realAuthCode = basesCacheService.getAuthCode(phone);
        return authCode.equals(realAuthCode);
    }

    /**
     * 发送短信验证码
     * @param phone 手机号
     * @param authCode 验证码
     */
        private void sendMessage(String phone,String authCode) {
        DefaultProfile profile = DefaultProfile.getProfile("cn-hangzhou", "LTAIDlWjcv4s8bGI", "H0ifT1P1EQ8ptQGKbnavO8w5YAxsHG");
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", "cn-hangzhou");
        request.putQueryParameter("PhoneNumbers", phone);
        request.putQueryParameter("SignName", "NS游折扣");
        request.putQueryParameter("TemplateCode", "SMS_162735681");
        request.putQueryParameter("TemplateParam", "{\"code\":\""+authCode+"\""+"}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println(response.getData());
        } catch (ServerException e) {
            LOGGER.info("短信服务异常:{}", e.getRequestId());
        } catch (ClientException e) {
            LOGGER.info("短信验证异常:{}", e.getRequestId());
        }
    }
}
