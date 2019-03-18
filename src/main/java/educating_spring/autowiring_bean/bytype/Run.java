package educating_spring.autowiring_bean.bytype;

import educating_spring.autowiring_bean.Exam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-by-type-config.xml");
        Exam exam = (Exam) context.getBean("bytype");
        exam.examCheck();
    }
}
