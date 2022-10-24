package com.curry.common.resource;

import com.curry.common.ApiErrorCode;

import java.io.Serializable;

/**
 * 接口通用返回数据格式
 *
 * @author curry
 * @since 2022-10-24
 */
public class ApiResponse<T extends Serializable> implements Serializable {
    private static final long serialVersionUID = 1L;

    private final int code;

    private final String msg;

    private final T result;

    private ApiResponse(int code, String msg, T result) {
        this.code = code;
        this.msg = msg;
        this.result = result;
    }

    public static <T extends Serializable> ApiResponse<T> ok(T result) {
        return ok(null, result);
    }

    public static <T extends Serializable> ApiResponse<T> ok(String msg, T result) {
        return new ApiResponse<>(0, msg, result);
    }

    public static <T extends Serializable> ApiResponse<T> error(ApiErrorCode code, String msg, T t) {
        return new ApiResponse<>(code.value(), msg, t);
    }

    public static <T extends Serializable> ApiResponse<T> error(ApiErrorCode code, String msg) {
        return new ApiResponse<>(code.value(), msg, null);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getResult() {
        return result;
    }
}
