package educating_spring.events.custom;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MyEventHendler implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        MyEvent myEvent = new MyEvent(this);
        if (applicationEvent instanceof MyEvent){
            System.out.println(myEvent);
        }
    }
}
