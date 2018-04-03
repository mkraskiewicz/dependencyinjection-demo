package com.mkraskiewicz.springframework.services.impl;

import com.mkraskiewicz.springframework.services.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by Maciej on mar, 2018
 */
@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO = "Greetings everyone - Original";

    public String sayHello(){
        return HELLO;
    }
}
