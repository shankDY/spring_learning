package educating_spring.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);
        context.start();
        Message message = context.getBean(Message.class);
        message.getMessage();
        context.stop();

    }
}
