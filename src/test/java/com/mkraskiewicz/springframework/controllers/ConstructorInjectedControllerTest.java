package com.mkraskiewicz.springframework.controllers;

import com.mkraskiewicz.springframework.controllers.ConstructorInjectedController;
import com.mkraskiewicz.springframework.services.impl.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Maciej on kwi, 2018
 */
public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception {

        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {

        assertEquals(GreetingServiceImpl.HELLO, constructorInjectedController.sayHello());
    }
}
