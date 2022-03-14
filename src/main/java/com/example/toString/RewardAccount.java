package com.example.toString;

import lombok.ToString;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:33 AM
**/
@ToString
public class RewardAccount  extends Account{

    private String rewardAccountsId;

    private Object[] relatedAccounts;

    public String getRewardAccountsId() {
        return rewardAccountsId;
    }

    public void setRewardAccountId(String rewardAccountsId) {
        this.rewardAccountsId = rewardAccountsId;
    }

    public Object[] getRelatedAccounts() {
        return relatedAccounts;
    }

    public void setRelatedAccounts(Object[] relatedAccounts) {
        this.relatedAccounts = relatedAccounts;
    }
}
