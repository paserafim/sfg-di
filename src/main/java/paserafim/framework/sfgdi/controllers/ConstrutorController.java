package paserafim.framework.sfgdi.controllers;

import paserafim.framework.sfgdi.Services.GreetingService;

public class ConstrutorController {

    private final GreetingService greetingService;

    public ConstrutorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
