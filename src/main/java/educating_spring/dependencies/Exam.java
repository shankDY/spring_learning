package educating_spring.dependencies;

public class Exam {
    private AnswerChecker answerChecker;

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("We've just set answerChecker using setter.");
    }

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
