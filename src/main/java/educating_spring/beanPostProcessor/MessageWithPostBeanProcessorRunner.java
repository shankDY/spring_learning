package educating_spring.beanPostProcessor;

import educating_spring.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//example Spring BeanFactory Container
public class MessageWithPostBeanProcessorRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("message-bean.xml");
        Message message = (Message) context.getBean("message_singleton");
        System.out.println("\n===================================================");
        message.getMessage();
        System.out.println("\n===================================================");
        context.registerShutdownHook();
    }
}