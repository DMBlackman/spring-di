package dmb.springframework.springdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author - DB
 * @date - 6/30/2021
 */

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
