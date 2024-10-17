package com.example.SimpleWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
    
    @RequestMapping("/")
    public String greet(){
        return "Hello....Please Login";
    }

    @RequestMapping("/login")
    public String login(){
        return "Welcome to the login page";
    }
    
}
