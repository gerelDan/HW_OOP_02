import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Human {
    private Integer id;
    private final Date dob;
    private final String firstName;
    private final String sex;
    private Integer countChild = 0;

    public Human(Date dob, String firstName, String lastName, String sex) {
        this.dob = dob;
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
        if (!mother.getChild().containsValue(this)) mother.addChildren(this);
    }
    public void setFather(Human father){
        this.father = father;
        if (!father.getChild().containsValue(this)) father.addChildren(this);
    }
    public void addChildren(Human children){
        child.put(++countChild, children);
        if(this.getSex().equals("male") & children.getFather() == null) children.setFather(this);
        else if(this.getSex().equals("female") & children.getMother() == null) children.setMother(this);
    }
    public Integer getCountChild(){
        return countChild;
    }
    public HashMap<Integer, Human> getChild(){
        return this.child;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(id, human.id) && Objects.equals(dob, human.dob) && Objects.equals(firstName, human.firstName) && Objects.equals(sex, human.sex) && Objects.equals(countChild, human.countChild) && Objects.equals(lastName, human.lastName) && Objects.equals(dod, human.dod) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Objects.equals(child, human.child);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dob, firstName, sex, countChild, lastName, dod, mother, father, child);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", dob=" + dob +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", countChild=" + countChild +
                ", dod=" + dod +
                '}';
    }
}
