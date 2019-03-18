package educating_spring.dependencies;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamRunner {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("exam-bin.xml");
        Exam exam = (Exam) context.getBean("exam");
        exam.examCheck();
    }
}
