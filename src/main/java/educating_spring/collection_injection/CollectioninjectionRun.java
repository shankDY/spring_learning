package educating_spring.collection_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectioninjectionRun {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collection-injection-config.xml");
        Collectioninjection collectioninjection = (Collectioninjection) context.getBean("collectioninjection");

        collectioninjection.getDocumentList();
        collectioninjection.getDocumentSet();
        collectioninjection.getDocumentMap();
        collectioninjection.getDocumentProp();
    }
}
