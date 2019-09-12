package com.chengw.common.enums;


/**
 * @author chengw
 */
public enum StatusCode implements AbstractStatusCode {

    OK(200,"成功"),
    FAIL(400,"操作失败"),
    FAIL_C(401,"验证码错误"),
    FAIL_P(402,"用户名或者密码错误")
    ;


    private StatusCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    private Integer code;

    private String message;

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
