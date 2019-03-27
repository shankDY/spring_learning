package educating_spring.java_configure.example2;

public class Exam {
    private AnsweChecker answeChecker;

    public Exam(AnsweChecker answeChecker){
        this.answeChecker = answeChecker;
    }

    public AnsweChecker getAnsweChecker() {
        return answeChecker;
    }

    public void checkExam(){
        answeChecker.checkAnswer();
    }
}
