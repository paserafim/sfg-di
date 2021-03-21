package paserafim.framework.sfgdi.Services;

import org.springframework.stereotype.Service;

@Service
public class ConstrutorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world - Construtor";
    }
}
