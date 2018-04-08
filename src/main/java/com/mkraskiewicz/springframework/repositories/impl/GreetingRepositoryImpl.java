package com.mkraskiewicz.springframework.repositories.impl;

import com.mkraskiewicz.springframework.repositories.GreetingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Maciej on kwi, 2018
 */
@Repository
public class GreetingRepositoryImpl implements GreetingRepository{

    private static final String POLISH_HELLO = "Witam wszystkich - Główny Serwis.";
    public static final String GERMAN_HELLO = "Hallo alle - Primar Service.";
    public static final String ENGLISH_HELLO = "Greetings everyone - Original";

    @Override
    public String getEnglishGreeting() { return ENGLISH_HELLO; }

    @Override
    public String getPolishGreeting() { return POLISH_HELLO; }

    @Override
    public String getGermanGreeting() {
        return GERMAN_HELLO;
    }
}
