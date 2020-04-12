package org.jasonper.discountportal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jasonper.discountcommon.api.CommonResult;
import org.jasonper.discountmbg.model.PlayerBases;
import org.jasonper.discountportal.service.PlayerBasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/12 11:10
 * @description 玩家登陆注册管理Controller
 */
@Controller
@Api(tags = "PlayerBasesController", description = "玩家登陆注册管理")
@RequestMapping("/sso")
public class PlayerBasesController {
    @Value("${jwt.tokenHeader}")
    private String tokenHeader;
    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    private PlayerBasesService playerBasesService;

    @ApiOperation("用户注册")
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult register(@RequestParam String playName, @RequestParam String password, @RequestParam String phone, @RequestParam String authCode){
        playerBasesService.register(playName, password, phone, authCode);
        return CommonResult.success(null,"注册成功");
    }

    @ApiOperation("用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult login(@RequestParam String playName, @RequestParam String password){
        String token = playerBasesService.login(playName, password);
        if (token == null){
            return  CommonResult.validateFailed("用户名或密码错误");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", token);
        return CommonResult.success(tokenMap);
    }

    @ApiOperation("获取用户信息")
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult info(Principal principal){
        if (principal == null){
            return CommonResult.unauthorized(null);
        }
        PlayerBases playerBases = playerBasesService.getCurrentPlayer();
        return CommonResult.success(playerBases);
    }

    @ApiOperation("获取验证码")
    @RequestMapping(value = "/getAuthCode", method = RequestMethod.GET)
    @ResponseBody
    public  CommonResult getAuthCode(@RequestParam String phone){
        String authCode =  playerBasesService.generateAuthCode(phone);
        return CommonResult.success(authCode, "获取验证码成功");
    }

    @ApiOperation("修改密码")
    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updatePassword(@RequestParam String phone, @RequestParam String password, @RequestParam String authCode){
        playerBasesService.updatePassword(phone, password, authCode);
        return CommonResult.success(null, "修改密码成功");
    }

    public CommonResult refreshToken(HttpServletRequest request){
        String token = request.getHeader(tokenHead);
        String refreshToken = playerBasesService.refreshToken(token);
        if (refreshToken == null){
            return CommonResult.failed("token已经过期!");
        }
        Map<String, String> tokenMap = new HashMap<>();
        tokenMap.put("token", refreshToken);
        tokenMap.put("tokenHead", tokenHead);
        return CommonResult.success(tokenMap);
    }
}
