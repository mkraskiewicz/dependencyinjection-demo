package com.mkraskiewicz.springframework.services.impl;

import com.mkraskiewicz.springframework.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Maciej on kwi, 2018
 */
@Service
@Primary
@Profile("de")
public class GermanPrimaryGreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hallo alle - Primar Service.";

    @Override
    public String sayHello() {
        return HELLO;
    }
}
