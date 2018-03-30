package com.mkraskiewicz.springframework.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Maciej on $ mar, 2018
 */
@Controller
public class MyController {

    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public void printMessage(){
        System.out.println(message);
    }
}
