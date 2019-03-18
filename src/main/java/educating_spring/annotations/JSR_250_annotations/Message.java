package educating_spring.annotations.JSR_250_annotations;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Message implements InitializingBean, DisposableBean {
    private String message;

    public String getMessage() {
        return "Message" + message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void beanInit(){
        System.out.println("Bean is passing init stage");
    }

    private void beanDestroy(){
        System.out.println("Bean is passing destroy stage");
    }

    public void destroy() throws Exception {
     beanInit();
    }

    public void afterPropertiesSet() throws Exception {
        beanDestroy();
    }
}
