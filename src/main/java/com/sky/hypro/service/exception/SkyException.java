package com.zidanduanxin.api.exception;

/**
 * 通用的异常信息
 *
 * Created by zhang.shaolong on 2018/9/4.
 */
public class ZidanException extends RuntimeException{

    /** 错误码信息  **/
    private int errorCode;

    private String message;

    public ZidanException() {
        super();
    }

    public ZidanException(String message) {
        super(message);
        this.errorCode = ErrorCode.UNKNOW_ERROR.getCode();
    }

    public ZidanException(ErrorCode errorCode) {
        super(errorCode.getDescription());
        this.errorCode = errorCode.getCode();
    }

    public ZidanException(ErrorCode errorCode, String message) {
        super(errorCode.getDescription());
        this.errorCode = errorCode.getCode();
        this.message = message;
    }

    public ZidanException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getDescription(),cause);
        this.errorCode = errorCode.getCode();
    }

    public ZidanException(Throwable cause) {
        super(cause);
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
