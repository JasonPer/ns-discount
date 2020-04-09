package org.jasonper.discountcommon.api;

/**
 * @author JasonPer
 * @version 1.0
 * @date 2020/4/9 16:06
 * @description 枚举类：常用API操作码
 */
public enum ResultCode implements IErrorCode{
        SUCCESS(200, "操作成功"),
        FAILED(500, "操作失败"),
        VALIDATE_FAILED(404, "参数检验失败"),
        UNAUTHORIZED(401, "暂未登录或token已经过期"),
        FORBIDDEN(403, "没有相关权限");

    private long code;
    private String message;

    ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
