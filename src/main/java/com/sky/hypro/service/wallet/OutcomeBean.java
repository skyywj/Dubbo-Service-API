package com.sky.hypro.service.wallet;

import java.math.BigDecimal;

/**
 * @Author: CarryJey @Date: 2018/10/22 17:50:53
 */
public class OutcomeBean {
    private long id;
    private long userId;
    private String userPhone;
    private long fromUserId;
    private String fromUserPhone;
    private BigDecimal amount; //数额
    private String type; //记录转账类型
    private String desc; //备注信息
    private long createTime;
    private long updateTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getFromUserPhone() {
        return fromUserPhone;
    }

    public void setFromUserPhone(String fromUserPhone) {
        this.fromUserPhone = fromUserPhone;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "OutcomeBean{"
            + "id="
            + id
            + ", userId="
            + userId
            + ", userPhone='"
            + userPhone
            + '\''
            + ", fromUserId="
            + fromUserId
            + ", fromUserPhone='"
            + fromUserPhone
            + '\''
            + ", amount="
            + amount
            + ", type='"
            + type
            + '\''
            + ", desc='"
            + desc
            + '\''
            + ", createTime="
            + createTime
            + ", updateTime="
            + updateTime
            + '}';
    }
}
