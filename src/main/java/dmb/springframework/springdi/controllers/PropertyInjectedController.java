package dmb.springframework.springdi.controllers;

import dmb.springframework.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author - DB
 * @date - 6/30/2021
 */

@Controller
public class PropertyInjectedController {

    @Qualifier("propteryInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
