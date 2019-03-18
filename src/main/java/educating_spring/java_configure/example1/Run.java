package educating_spring.java_configure.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MessageConfigure.class);
        Message message = context.getBean(Message.class);
        message.setMessage("Hello Alexander");
        System.out.println(message);
    }
}
