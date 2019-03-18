package educating_spring.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Position {
    //данная анатация указывает , какой конкретно бин необходимо использовать
    @Qualifier("java_developer")
    @Autowired
    private Developer developer;

    public Position(){

    }

    public void getDevelopersInfo(){
        System.out.println(this.developer);
    }
}
