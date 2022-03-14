package com.example.with;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.With;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 12:57 PM
**/
@Getter
@AllArgsConstructor
public class User {
    private final String userName;
    private final String emailAddress;

    @With
    private final boolean isAuthenticated;
}
