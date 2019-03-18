package educating_spring.autowiring_bean.no;

import educating_spring.autowiring_bean.Exam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("no-autowiring-config.xml");
        Exam exam = (Exam) context.getBean("no-autowiring");
        exam.examCheck();
    }

}
