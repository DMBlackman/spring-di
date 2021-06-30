package dmb.springframework.springdi.services;

import org.springframework.stereotype.Service;

/**
 * @author - DB
 * @date - 6/30/2021
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
