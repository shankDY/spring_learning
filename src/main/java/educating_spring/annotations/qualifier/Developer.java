package educating_spring.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class Developer {
    private String name;
    private int experience;
    private String specialty;

    @Autowired
    public Developer(String name, int experience, String specialty){
        this.name = name;
        this.experience = experience;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Developer info:"+
                "\nName: " + name+";\n"+
                "Experience: "+experience+" years;\n"+
                "Specialty: " + specialty +".\n";
    }
}
