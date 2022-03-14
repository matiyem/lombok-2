package com.example.with;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 12:32 PM
**/
@Getter
@AllArgsConstructor
public class Holder {

    @With
    private String variableA;

    @With
    private String _variableB;

    @With
    private String $variableC;
}
