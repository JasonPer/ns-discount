package org.jasonper.discountcommon.exception;

import org.jasonper.discountcommon.api.IErrorCode;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/9 16:37
 * @description 断言类：用于抛出各种API异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
