package com.mkraskiewicz.springframework.controllers;

import com.mkraskiewicz.springframework.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Maciej on mar, 2018
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
