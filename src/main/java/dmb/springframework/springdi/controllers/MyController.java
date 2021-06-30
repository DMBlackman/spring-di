package dmb.springframework.springdi.controllers;

import dmb.springframework.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * @author - DB
 * @date - 6/30/2021
 */

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
