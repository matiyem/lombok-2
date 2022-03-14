package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:23 AM
**/
@Accessors(prefix = {"s","bd"})
@Getter
@Setter
public class PrefixedAccount {
    private String sName;
    private BigDecimal bdBalance;

    @Accessors(prefix = "s_")
    private String s_notes;
}
