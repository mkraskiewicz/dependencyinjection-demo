package com.mkraskiewicz.springframework.config;

import com.mkraskiewicz.springframework.repositories.GreetingRepository;
import com.mkraskiewicz.springframework.services.GreetingService;
import com.mkraskiewicz.springframework.services.impl.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * Created by Maciej on kwi, 2018
 */
@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({"en","default"})
    GreetingService primaryGreetingServiceFactory(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("pl")
    GreetingService primaryPolishGreetingServiceFactory(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("pl");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingServiceFactory(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("de");
    }
}
