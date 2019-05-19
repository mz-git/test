package com.example.student.utils;

public class StringUtils {

    public static boolean isEmpty(String str){
        if(str == null){
            return true;
        }
        if(str.trim().length() == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isEmpty(null));
        System.out.println(isEmpty(""));
        System.out.println(isEmpty("  "));

    }
}
