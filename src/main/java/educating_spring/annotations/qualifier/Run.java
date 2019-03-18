package educating_spring.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotations-qualifier-config.xml");

        Position position = (Position) context.getBean("position");
        position.getDevelopersInfo();

    }
}
