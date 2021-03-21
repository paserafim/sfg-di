package paserafim.framework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import paserafim.framework.sfgdi.Services.GreetingService;
import paserafim.framework.sfgdi.Services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class ConstrutorControllerTest {

    ConstrutorController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstrutorController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}