package com.example.with;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 12:38 PM
**/
public class KioskDevice extends Device {

    public KioskDevice(String serial, boolean isInspected) {
        super(serial, isInspected);
    }
    @Override
    public Device withInspected(boolean isInspected) {
        return new KioskDevice(getSerial(), isInspected);
    }
}
