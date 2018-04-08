package com.mkraskiewicz.springframework.services.impl;

import com.mkraskiewicz.springframework.repositories.GreetingRepository;
import com.mkraskiewicz.springframework.services.GreetingService;

/**
 * Created by Maciej on kwi, 2018
 */

public class GermanPrimaryGreetingServiceImpl implements GreetingService {

    private GreetingRepository greetingRepository;

    public GermanPrimaryGreetingServiceImpl(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayHello() {
        return greetingRepository.getGermanGreeting();
    }
}
