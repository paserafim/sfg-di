package paserafim.framework.sfgdi.controllers;

import org.springframework.stereotype.Controller;
import paserafim.framework.sfgdi.Services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHelloWorld() {

        return greetingService.sayGreeting();
    }
}
