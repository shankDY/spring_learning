package educating_spring.collection_injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collectioninjection {
    private List documentList;
    private Set documentSet;
    private Map documentMap;
    private Properties documentProp;

    public List getDocumentList() {
        System.out.println("DocumentList: "+documentList);
        return documentList;
    }

    public Set getDocumentSet() {
        System.out.println("DocumentSet: "+documentSet);
        return documentSet;
    }

    public Map getDocumentMap() {
        System.out.println("DocumentMap: "+documentMap);
        return documentMap;
    }

    public Properties getDocumentProp() {
        System.out.println("DocumentProp: "+documentProp);
        return documentProp;
    }


    public void setDocumentList(List documentList) {
        this.documentList = documentList;
    }

    public void setDocumentSet(Set documentSet) {
        this.documentSet = documentSet;
    }

    public void setDocumentMap(Map documentMap) {
        this.documentMap = documentMap;
    }

    public void setDocumentProp(Properties documentProp) {
        this.documentProp = documentProp;
    }
}
