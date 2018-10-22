package com.sky.hypro.service.wallet;

import java.math.BigDecimal;

/**
 * @Author: CarryJey @Date: 2018/10/22 17:27:37
 */
public class WalletResponse {

    private BigDecimal totolAmount;
    private boolean isDone;

    public BigDecimal getTotolAmount() {
        return totolAmount;
    }

    public void setTotolAmount(BigDecimal totolAmount) {
        this.totolAmount = totolAmount;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
