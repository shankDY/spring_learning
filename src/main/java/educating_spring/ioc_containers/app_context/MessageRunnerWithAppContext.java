package educating_spring.ioc_containers.app_context;

import educating_spring.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

//example Spring BeanFactory Container
public class MessageRunnerWithAppContext {
    public static void main(String[] args) {
        //указываем конфигурационный файл
       ApplicationContext context =
               new FileSystemXmlApplicationContext("src/main/resources/message-bean.xml");
       //получаем bean из конфигурационного файла
        Message message = (Message) context.getBean("message");
        message.getMessage();

    }
}