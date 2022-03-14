package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:22 AM
**/
@Accessors(fluent = true, chain = false)
@Getter
@Setter
public class FluentAccount {
    private String name;
    private BigDecimal balance;
}
