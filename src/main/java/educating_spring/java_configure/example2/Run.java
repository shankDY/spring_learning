package educating_spring.java_configure.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ExamConfigure.class);
        Exam exam =  context.getBean(Exam.class);
        exam.checkExam();
    }
}
