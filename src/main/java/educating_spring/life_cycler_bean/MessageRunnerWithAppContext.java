package educating_spring.life_cycler_bean;

import educating_spring.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//example Spring BeanFactory Container
public class MessageRunnerWithAppContext {
    public static void main(String[] args) {
        //указываем конфигурационный файл
       FileSystemXmlApplicationContext context =
               new FileSystemXmlApplicationContext("src/main/resources/message-bean.xml");
       //получаем bean из конфигурационного файла
        Message message = (Message) context.getBean("message_singleton");
        message.getMessage();
        //убиваем наш бин
        context.registerShutdownHook();

    }
}