package paserafim.framework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import paserafim.framework.sfgdi.Services.GreetingService;

@Controller
public class SetterInjectedController {
    @Autowired
    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
