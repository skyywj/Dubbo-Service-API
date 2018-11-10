package com.sky.hypro.service.exception;

/**
 * 通用的异常信息
 * @author CarryJey
 * @since 2018/11/10
 */
public class SkyException extends RuntimeException{

    /** 错误码信息  **/
    private int errorCode;

    private String message;

    public SkyException() {
        super();
    }

    public SkyException(String message) {
        super(message);
        this.errorCode = ErrorCode.UNKNOW_ERROR.getCode();
    }

    public SkyException(ErrorCode errorCode) {
        super(errorCode.getDescription());
        this.errorCode = errorCode.getCode();
    }

    public SkyException(ErrorCode errorCode, String message) {
        super(errorCode.getDescription());
        this.errorCode = errorCode.getCode();
        this.message = message;
    }

    public SkyException(ErrorCode errorCode, Throwable cause) {
        super(errorCode.getDescription(),cause);
        this.errorCode = errorCode.getCode();
    }

    public SkyException(Throwable cause) {
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
