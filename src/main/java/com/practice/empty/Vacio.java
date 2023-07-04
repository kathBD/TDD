package com.practice.empty;

public class Vacio {

    public static  boolean isEmpty(String str){
        return str == null || str.trim().length() <= 0;
    }
}
