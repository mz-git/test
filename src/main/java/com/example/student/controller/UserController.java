package com.example.student.controller;

public class UserController {
    public static long current_on_line = 0;

    public void login(){
        current_on_line++;
    }
    public void logout(){
        current_on_line--;
    }
}
