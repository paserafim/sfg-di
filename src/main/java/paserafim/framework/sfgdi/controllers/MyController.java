package paserafim.framework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHelloWorld() {
        System.out.println("Hello World!");

        return "Hi folks!";
    }
}
