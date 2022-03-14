package com.example.with;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.With;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 12:36 PM
**/
@With
@AllArgsConstructor
public class ImprovedUser {

    @NonNull
    private final String userName;

    @NonNull
    private final String emailAddress;
}
