package educating_spring.inheritance;

import educating_spring.Message;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageInheritanceRun {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("inheritance-bean.xml");
        Message message = (Message) context.getBean("message");
        System.out.println("First bean");
        message.getMessage();
        System.out.println("===================================================");

        MessageToYou message2 = (MessageToYou) context.getBean("message_To_you");
        System.out.println("Second bean");
        message2.getMessage();
        message2.getMessageYou();

    }
}
