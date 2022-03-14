package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:20 AM
**/
@Accessors(chain = true)
@Getter
@Setter
public class ChainedAccount {
    private String name;
    private BigDecimal balance;
}
