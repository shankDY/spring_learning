package educating_spring.autowiring_bean.byname;

import educating_spring.autowiring_bean.Exam;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExambyNameRun {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-by-name-config.xml");
        Exam exam = (Exam) context.getBean("examen");
        exam.examCheck();
    }
}
