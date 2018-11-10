package com.zidanduanxin.api.exception;

/**
 * Created by zhang.shaolong on 2018/9/4.
 */
public enum ErrorCode {
    SERVICE_ERROR(500, "service error"),

    PARAM_ERROR(505, "params error"),

    SIGN_ERROR(506, "sign error"),

    ORDER_ERROR(509, "order error"),

    PRICE_ERROR(508, "price error"),

    TYPE_ERROR(502, "type error"),

    UNKNOW_ERROR(911, "unkonw error"),

    NOT_FOUND_ERROR(510, "not found error"),

    CRYPTO_ERROR(511,"crypto error");


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
