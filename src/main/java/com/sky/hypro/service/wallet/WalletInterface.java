package com.sky.hypro.service.wallet;

import java.util.List;

/**
 * @Author: CarryJey @Date: 2018/10/22 17:27:54
 *
 * 钱包相关接口
 */
public interface WalletInterface {

    public WalletBean getBalanceByUserId(long userId);
    public List<IncomeBean> getIncomeRecord(long userId);
    public List<OutcomeBean> getOutcomeRecord(long userId);
    public WalletResponse updateBalance(WalletRequest walletRequest);

}
