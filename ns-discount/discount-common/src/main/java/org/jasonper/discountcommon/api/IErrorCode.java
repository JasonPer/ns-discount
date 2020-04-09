package org.jasonper.discountcommon.api;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/9 16:04
 * @description API的错误码
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}
