package educating_spring.autowiring_bean;

public class Exam {
   private AnswerChecker answerChecker;
   private String subject;

    public AnswerChecker getAnswerChecker() {
        return answerChecker;
    }

    public void setAnswerChecker(AnswerChecker answerChecker) {
        this.answerChecker = answerChecker;
        System.out.println("we've just set answerChecker using setter ");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void examCheck(){
        answerChecker.checkAnswer();
    }
}
