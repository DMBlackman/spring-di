package dmb.springframework.springdi.controllers;

import dmb.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author - DB
 * @date - 7/4/2021
 */

@Controller
public class I18nController {
    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
       return greetingService.sayGreeting();
    }
}
