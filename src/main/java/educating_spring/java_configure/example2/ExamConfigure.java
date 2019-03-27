package educating_spring.java_configure.example2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ExamConfigure {

    @Bean
    public Exam exam(){
        return new Exam(answerChecker());
    }

    @Bean
    @Scope("singleton")
    public AnsweChecker answerChecker() {
        return new AnsweChecker();
    }
}
