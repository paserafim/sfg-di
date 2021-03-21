package paserafim.framework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import paserafim.framework.sfgdi.Services.ConstrutorGreetingService;

class PropertyInjectedControllerTest {
    // manual injection
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstrutorGreetingService();

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}