package educating_spring.java_configure.example1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfigure {

    @Bean
    public Message printMessage(){
        return new Message();
    }

}
