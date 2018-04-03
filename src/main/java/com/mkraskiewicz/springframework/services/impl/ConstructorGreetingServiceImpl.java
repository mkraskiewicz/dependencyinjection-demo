package com.mkraskiewicz.springframework.services.impl;

import com.mkraskiewicz.springframework.services.GreetingService;
import org.springframework.stereotype.Service;

/**
 * Created by Maciej on kwi, 2018
 */
@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Greetings everyone - I was injected by Constructor.";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
