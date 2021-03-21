package paserafim.framework.sfgdi.controllers;

import paserafim.framework.sfgdi.Services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
