package paserafim.framework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import paserafim.framework.sfgdi.Services.GreetingService;

@Controller
public class ConstrutorInjectedController {
    // @Autowired  -- opcional here
    private final GreetingService greetingService;

    public ConstrutorInjectedController(@Qualifier("construtorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
