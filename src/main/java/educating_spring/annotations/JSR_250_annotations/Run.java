package educating_spring.annotations.JSR_250_annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("jsr250.xml");

        Message message = (Message) context.getBean("messages");
        System.out.println(message.getMessage());
        context.registerShutdownHook();
    }
}
