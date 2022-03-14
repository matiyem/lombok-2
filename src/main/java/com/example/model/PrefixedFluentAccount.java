package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:26 AM
**/
@Accessors(prefix = {"s","bd"},fluent = true)
@Getter
@Setter
public class PrefixedFluentAccount {
    private String sName;
    private BigDecimal bdBalance;
}
