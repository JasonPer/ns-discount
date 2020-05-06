package org.jasonper.discountportal.service;

import org.jasonper.discountportal.domain.OssCallbackResult;
import org.jasonper.discountportal.domain.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/5/4 23:09
 * @description Oss上传管理Service
 */
public interface OssService {
    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
