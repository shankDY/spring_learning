package educating_spring.events;

public class Message {
    private String message;

    public Message(String message) {
        System.out.println("Добро пожаловать в первичный конструктор");
        this.message = message;
    }


    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message: "+ message);
    }
}
