package educating_spring.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

    @Bean
    public Message printMessage(){ return new Message("Hi man");}

    @Bean
    public Events stopEvent(){return new Events();}
}
