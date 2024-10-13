import java.util.Date;
import java.util.HashMap;

public class Human {
    private Integer id;
    private final Date db;
    private final String firstName;
    private final String sex;
    private Integer countChild = 0;

    public Human(Date db, String firstName, String lastName, String sex) {
        this.db = db;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    private final String lastName;
    private Date dod;
    private Human mother=null;
    private Human father=null;
    private HashMap<Integer, Human> child = new HashMap<>();

    public Human getFather() {
        return this.father;
    }
    public Human getMother(){
        return this.mother;
    }
    public String getSex(){
        return this.sex;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setMother(Human mother){
        this.mother = mother;
    }
    public void setFather(Human father){
        this.father = father;
    }
    public void addChildren(Human children){
        child.put(++countChild, children);
        if(this.getSex().equals("male") & children.getFather() == null) children.setFather(this);
        else if(this.getSex().equals("female") & children.getMother() == null) children.setMother(this);
    }
    public Integer getCountChild(){
        return countChild;
    }
}
