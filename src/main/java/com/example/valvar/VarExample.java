package com.example.valvar;

import lombok.var;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Create by Atiye Mousavi 
    Date: 3/13/2022
    Time: 12:12 PM
**/
public class VarExample {
//    val در نسخه 0.10 معرفی شد. هنگام استفاده از val، لومبوک متغیر را نهایی اعلام می کند و پس از مقداردهی اولیه، آن را به طور خودکار استنباط می کند. بنابراین، عبارت مقداردهی اولیه اجباری است.
    public String name(){
        var name="name";
        name="newName";
        System.out.println("Name: " + name);
        return name;
    }
    public Integer age(){
        var age=Integer.valueOf(30);
        age=35;
        System.out.println("Age: " + age);
        return age;
    }
    public ArrayList<String> listOf(){
        var agenda=new ArrayList<String>();
        agenda.add("Day 1");
        agenda=new ArrayList<String>(Arrays.asList("Day 2"));
        System.out.println("Agenda: " + agenda);
        return agenda;
    }
    public Map<Integer,String> mapOf(){
        var books=new HashMap<Integer,String>();
        books.put(1,"Book 1");
        books.put(2,"Book 2");
        books=new HashMap<Integer,String>();
        books.put(3,"Book 3");
        books.put(4,"Book 4");

        System.out.println("Books:");
        for (var entry: books.entrySet()){
            System.out.printf("- %d. %s\n", entry.getKey(), entry.getValue());
        }
        return books;
    }
}
