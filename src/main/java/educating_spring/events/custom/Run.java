package educating_spring.events.custom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);

        MyEventPublisher myEventPublisher = context.getBean(MyEventPublisher.class);

        myEventPublisher.publishEvent();
    }
}
