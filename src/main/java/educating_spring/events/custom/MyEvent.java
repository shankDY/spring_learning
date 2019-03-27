package educating_spring.events.custom;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {
    public MyEvent(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "Этот ивент создан мной(^_^)";
    }
}
