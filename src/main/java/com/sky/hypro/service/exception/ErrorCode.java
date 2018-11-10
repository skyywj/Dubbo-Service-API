package com.sky.hypro.service.exception;

/**
 * @author CarryJey
 * @since 2018/11/10
 */
public enum ErrorCode {
    SERVICE_ERROR(500, "service error"),

    PARAM_ERROR(505, "params error"),

    TYPE_ERROR(502, "type error"),

    UNKNOW_ERROR(911, "unkonw error"),

    NOT_FOUND_ERROR(510, "not found error"),

    CRYPTO_ERROR(511, "crypto error");

    private int code;
    private String description;

    private ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
