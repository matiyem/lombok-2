package com.example.toString;

import lombok.ToString;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:29 AM
**/
@ToString
public class Account {
//    بیایید کلاس Account خود را طوری تغییر دهیم که فیلد id قبل از هر فیلد دیگری بدون توجه به موقعیت اعلان در تعریف کلاس ارائه شود. ما می توانیم با اضافه کردن حاشیه نویسی @ToString.Include(rank = 1) به فیلد id به این مهم دست یابیم:
    private String name;

    @ToString.Include(rank = 1)
    private String id;

    @ToString.Exclude
    private String accountNumber;

    private String $ignored;

    @ToString.Include
    String description(){
        return "Account description";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String get$ignored() {
        return $ignored;
    }

    public void set$ignored(String $ignored) {
        this.$ignored = $ignored;
    }
}
