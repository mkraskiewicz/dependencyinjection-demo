package com.mkraskiewicz.springframework.controllers;

import com.mkraskiewicz.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by Maciej on mar, 2018
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //Annotation is not needed for Constructor DI!
    ConstructorInjectedController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
