package educating_spring.example_spring_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {
    public static void main(String[] args) {
        //указываем конфигурационный файл
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
        springHelloWorld.getHelloMessage();
    }
}
