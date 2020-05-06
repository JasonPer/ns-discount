package org.jasonper.discountportal.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.jasonper.discountcommon.api.CommonResult;
import org.jasonper.discountportal.domain.OssCallbackResult;
import org.jasonper.discountportal.domain.OssPolicyResult;
import org.jasonper.discountportal.service.impl.OssServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 23:20
 * @description Oss文件上传相关接口
 */
@Controller
@Api(tags = "OssController", description = "Oss文件上传管理")
@RequestMapping("/aliyun/oss")
public class OssController {
    @Autowired
    private OssServiceImpl ossService;

    @ApiOperation(value = "oss上传签名生成")
    @RequestMapping(value = "/policy", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<OssPolicyResult> policy() {
        OssPolicyResult result = ossService.policy();
        return CommonResult.success(result);
    }

    @ApiOperation(value = "oss上传成功回调")
    @RequestMapping(value = "/callback", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult<OssCallbackResult> callback(HttpServletRequest request) {
        OssCallbackResult ossCallbackResult = ossService.callback(request);
        return CommonResult.success(ossCallbackResult);
    }
}
