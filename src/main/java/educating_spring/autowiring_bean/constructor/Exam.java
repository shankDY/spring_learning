package educating_spring.autowiring_bean.constructor;

import educating_spring.autowiring_bean.AnswerChecker;

public class Exam {
   private AnswerChecker answerChecker;
   private String subject;

   public Exam(AnswerChecker answerChecker, String subject){
       this.answerChecker = answerChecker;
       this.subject = subject;
   }

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
