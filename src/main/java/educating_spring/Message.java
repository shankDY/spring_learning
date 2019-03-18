package educating_spring;

public class Message {
    private String message;

    public Message(String message) {
        this.message = message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message: "+ message);
    }

    public static void beanInit(){
        System.out.println("Bean is passing init stage");
    }

    public static void beanDestroy(){
        System.out.println("Bean is passing destroy stage");
    }
}