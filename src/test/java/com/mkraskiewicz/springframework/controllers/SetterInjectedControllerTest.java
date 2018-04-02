package com.mkraskiewicz.springframework.controllers;

import com.mkraskiewicz.springframework.services.impl.GreetingServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by Maciej on kwi, 2018
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {

        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }


    @Test
    public void testGreeting() throws Exception {

        Assert.assertEquals(GreetingServiceImpl.HELLO, setterInjectedController.sayHello());
    }
}
