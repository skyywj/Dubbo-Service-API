package com.sky.hypro.service.Idservice;

/**
 * CarryJey @Date: 2018/10/22 17:27:54
 */
public class InvalidSystemClock extends RuntimeException {
    private static final long serialVersionUID = -5467099203936524565L;

    public InvalidSystemClock(String s) {
        super(s);
    }
}
