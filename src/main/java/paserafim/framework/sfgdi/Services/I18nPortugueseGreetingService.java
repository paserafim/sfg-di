package paserafim.framework.sfgdi.Services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"PT", "default"})
@Service("i18nService")
public class I18nPortugueseGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Olá Mundo! - PT";
    }
}
