package com.chengw.common.models.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chengw
 */
@Data
public class CommonResponse implements Serializable {

    private static final long serialVersionUID = -5189136842557257607L;

    public static final int SUCCESS = 200;

    public static final int ERROR = 101;

    public static final int UNAUTHORIZED = 201;

    public static final int UNAUTHENTICATED = 511;

    public static final String SUCCESS_MESSAGE = "success";

    public static final String ERROR_MESSAGE = "error";

    public static final String UNAUTHORIZED_MESSAGE = "unauthorized";

    public static final String UNAUTHENTICATED_MESSAGE = "unauthorized";

    private Integer code;

    private String message;

    private Object result;

    public CommonResponse() {
        this(SUCCESS, SUCCESS_MESSAGE, null);
    }

    public CommonResponse(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResponse(Integer code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public static CommonResponse success() {
        return success(null);
    }

    public static CommonResponse success(Object result) {
        return new CommonResponse(SUCCESS, SUCCESS_MESSAGE, result);
    }

    public static CommonResponse error() {

        return new CommonResponse(ERROR, ERROR_MESSAGE, null);
    }

    public static CommonResponse error(String message) {
        return new CommonResponse(ERROR, message, null);
    }

    public static CommonResponse unauthorized() {
        return unauthorized(UNAUTHORIZED_MESSAGE);
    }

    public static CommonResponse unauthorized(String message) {
        return new CommonResponse(UNAUTHORIZED, message, null);
    }

    public static CommonResponse unauthenticated() {
        return unauthenticated(UNAUTHENTICATED_MESSAGE);
    }

    public static CommonResponse unauthenticated(String message) {
        return new CommonResponse(UNAUTHORIZED, message, null);
    }
}
