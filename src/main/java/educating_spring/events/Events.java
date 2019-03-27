package educating_spring.events;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class Events implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof ContextStoppedEvent){
            System.out.println("Мы получили ContextStopedEvent...");
        }else if(applicationEvent instanceof ContextStartedEvent){
            System.out.println("Мы получили ContextStartEvent...");
        }
    }
}
