package educating_spring.annotations.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotations-autowired-config.xml");
        Exam exam = (Exam) context.getBean("ex");
        exam.examCheck();
    }
}
