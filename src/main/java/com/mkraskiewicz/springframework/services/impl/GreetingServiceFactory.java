package com.mkraskiewicz.springframework.services.impl;

import com.mkraskiewicz.springframework.repositories.GreetingRepository;
import com.mkraskiewicz.springframework.services.GreetingService;

/**
 * Created by Maciej on kwi, 2018
 */
public class GreetingServiceFactory {

    private final GreetingRepository greetingRepository;

    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String language){

        GreetingService greetingService;
        switch (language){
            case "en":
                greetingService = new PrimaryGreetingServiceImpl(greetingRepository);
                break;
            case "de":
                greetingService = new GermanPrimaryGreetingServiceImpl(greetingRepository);
                break;
            case "pl":
                greetingService = new PolishPrimaryGreetingServiceImpl(greetingRepository);
                break;
            default:
                greetingService = new PrimaryGreetingServiceImpl(greetingRepository);
        }
        return greetingService;

    }


}
