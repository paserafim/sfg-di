package paserafim.framework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import paserafim.framework.sfgdi.Services.GreetingService;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return this.greetingService.sayGreeting();
    }
}
