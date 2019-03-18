package educating_spring.inheritance;

public class MessageToYou {
    private String message;
    private String messageYou;

    public MessageToYou(String message, String messageYou){
        this.message = message;
        this.messageYou = messageYou;
    }

    public void getMessage() {
        System.out.println("Message: "+message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessageYou() {
        System.out.println("Message: "+ messageYou);
    }

    public void setMessageYou(String messageYou) {
        this.messageYou = messageYou;
    }
}
