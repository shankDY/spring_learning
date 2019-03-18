package educating_spring.scope_beans;

import educating_spring.Message;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//example Spring BeanFactory Container
public class MessageRunnerPrototype {
    public static void main(String[] args) {
        //указываем конфигурационный файл
       ApplicationContext context = new ClassPathXmlApplicationContext("message-bean.xml");
       //получаем наш бин
        Message message1 = (Message) context.getBean("message_prototype");
        //устанавливаем значение
        message1.setMessage("Здарово, бандиты!!");
        //получаем значение
        message1.getMessage();
        //получем бин( в данном случае пполучим новый экземпляр бина)
        Message message2 = (Message) context.getBean("message_prototype");
        //получаем null , так как был создан абсолютно новый объект, которому мы ничего не присваивали.
        message2.getMessage();

    }
}