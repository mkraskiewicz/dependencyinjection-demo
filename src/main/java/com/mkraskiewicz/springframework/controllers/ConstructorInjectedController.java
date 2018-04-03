package com.mkraskiewicz.springframework.controllers;

import com.mkraskiewicz.springframework.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Maciej on mar, 2018
 */
@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //Annotation is not needed for Constructor DI!
    ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello();
    }
}
