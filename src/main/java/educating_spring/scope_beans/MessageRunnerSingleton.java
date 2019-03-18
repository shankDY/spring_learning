package educating_spring.scope_beans;

import educating_spring.Message;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

//example Spring BeanFactory Container
public class MessageRunnerSingleton {
    public static void main(String[] args) {
        //указываем конфигурационный файл
       ApplicationContext context = new ClassPathXmlApplicationContext("message-bean.xml");
        //получаем наш бин
        Message message1 = (Message) context.getBean("message_singleton");
        //устанавливаем значение
        message1.setMessage("Здарово, бандиты!!");
        //получаем значение
        message1.getMessage();

        //получем бин( в данном случае получим тот же экземпляр нашего бина из кеша)
        Message message2 = (Message) context.getBean("message_singleton");
        //получаем тоже самое значение
        message2.getMessage();

    }
}