package paserafim.framework.sfgdi.controllers;

import paserafim.framework.sfgdi.Services.GreetingService;

public class I18nController {

    private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return this.greetingService.sayGreeting();
    }
}
