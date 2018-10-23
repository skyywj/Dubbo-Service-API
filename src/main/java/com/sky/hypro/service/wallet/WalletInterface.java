package com.sky.hypro.service.wallet;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: CarryJey @Date: 2018/10/22 17:27:54
 *
 * 钱包相关接口
 */
public interface WalletInterface {

    /**
     * 获取用户余额接口
     * @param userId
     * @return
     */
    public BigDecimal getBalanceByUserId(long userId);

    /**
     * 获取用户收入记录接口
     * @param userId
     * @return
     */
    public List<RecordBean> getIncomeRecord(long userId);

    /**
     * 获取用户支出接口
     * @param userId
     * @return
     */
    public List<RecordBean> getOutcomeRecord(long userId);

    /**
     * 用户收支变动接口，更新用户余额及添加收支记录
     * @param recordBean
     * @return
     */
    public boolean updateBalance(RecordBean recordBean);

}
