package educating_spring.example_spring_app;

public class SpringHelloWorld {
    private String helloMessage;

    public SpringHelloWorld(String helloMessage) {
        this.helloMessage = helloMessage;
    }


    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

    public void  getHelloMessage() {
        System.out.println("Hello message: "+ helloMessage);
    }
}