package com.mkraskiewicz.springframework.controllers;

import com.mkraskiewicz.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Maciej on mar, 2018
 */
@Controller
public class PropertyInjectedController {

    //Filed injection is not recommended.
    @Autowired
    protected GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayHello();
    }
}
