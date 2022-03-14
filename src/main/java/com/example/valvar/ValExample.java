package com.example.valvar;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 11:39 AM
**/
public class ValExample {
//    var در نسخه 1.16.20 معرفی شد. مانند val، نوع را نیز از عبارت مقداردهی اولیه استنباط می کند با این تفاوت که متغیر به عنوان نهایی اعلام نمی شود. بنابراین، تخصیص بیشتر مجاز است، اما باید با نوع مشخص شده در هنگام اعلام متغیر مطابقت داشته باشد.
    public Class name() {
        val name = "name";
        System.out.println("Name: " + name);
        return name.getClass();
    }

    public Class age() {
        val age = Integer.valueOf(30);
        System.out.println("Age: " + age);
        return age.getClass();
    }

    public Class listOf() {
        val agenda = new ArrayList<String>();
        agenda.add("Day 1");
        System.out.println("Agenda: " + agenda);
        return agenda.getClass();
    }

    public Class mapOf() {
        val books = new HashMap<Integer, String>();
        books.put(1, "Book 1 ");
        books.put(2, "Book 2");
        System.out.println("Books:");
        for (val entry : books.entrySet()) {
            System.out.printf("- %d. %s\n", entry.getKey(), entry.getValue());
        }
        return books.getClass();
    }

    public Class compoundTypes(boolean isArray) {
        val compound = isArray ? new ArrayList<String>() : new HashSet<String>();
        return compound.getClass();
    }

}
