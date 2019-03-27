package educating_spring.events.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

    @Bean
    public MyEventHendler myEventHendler(){return new MyEventHendler();}

    @Bean
    public MyEventPublisher myEventPublisher(){return new MyEventPublisher();}
}
