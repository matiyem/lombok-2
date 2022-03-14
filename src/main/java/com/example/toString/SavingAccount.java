package com.example.toString;

import lombok.ToString;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:37 AM
**/
@ToString(callSuper = true)
public class SavingAccount extends Account  {

    private String savingAccountId;

    public String getSavingAccountId() {
        return savingAccountId;
    }

    public void setSavingAccountId(String savingAccountId) {
        this.savingAccountId = savingAccountId;
    }
}
