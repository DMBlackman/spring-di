package dmb.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author - DB
 * @date - 7/4/2021
 */

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Hello World - EN";
    }

}
