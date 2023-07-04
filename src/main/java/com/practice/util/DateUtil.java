package com.practice.util;

public class DateUtil {

    public static boolean isLeadYear(int year) {


        if (year % 4 == 0 && year % 100 !=0){
            return true;
        }

        if (year % 400 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}
