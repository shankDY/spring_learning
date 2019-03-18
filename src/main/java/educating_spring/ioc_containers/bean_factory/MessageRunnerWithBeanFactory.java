package educating_spring.ioc_containers.bean_factory;

import educating_spring.Message;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//example Spring BeanFactory Container
public class MessageRunnerWithBeanFactory {
    public static void main(String[] args) {
        //указываем конфигурационный файл
       XmlBeanFactory context = new XmlBeanFactory (new ClassPathResource("message-bean.xml"));
        Message message = (Message) context.getBean("message");
        message.getMessage();

    }
}