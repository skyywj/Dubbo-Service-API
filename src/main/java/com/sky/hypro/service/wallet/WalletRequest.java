package com.sky.hypro.service.wallet;

import java.math.BigDecimal;

/**
 * @Author: CarryJey @Date: 2018/10/22 17:27:25
 */
public class WalletRequest {

    private long userId;
    private BigDecimal amount;
    private String type;//IN:收入  OUT：支出

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "WalletRequest{" +
                "userId=" + userId +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
