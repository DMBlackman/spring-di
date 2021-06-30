package dmb.springframework.springdi.controllers;

import dmb.springframework.springdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author - DB
 * @date - 6/30/2021
 */

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {

        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreetingService() {
        System.out.println(controller.getGreeting());
    }
}