package educating_spring.autowiring_bean.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-by-constructor-config.xml");
        Exam exam = (Exam) context.getBean("byconstructor");
        exam.examCheck();
    }
}
