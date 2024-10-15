import java.io.Serializable;
import java.util.HashMap;

public class TreePerson implements Serializable {
    private int ID = 1;
    private int id;
    private HashMap<Integer, Human> tree ;

    public TreePerson() {
        this.tree = new HashMap<>();
    }

    public void addHuman(Human human){
        if (!(human.getId()>0) & !this.tree.containsValue(human)) {
            human.setId(ID);
            this.tree.put(ID++, human);
        }
    }
    public void addHuman(Human[] humans){
        for (Human human: humans){
            addHuman(human);
        }
    }
    public HashMap<Integer, Human> getChild(Human human){
        return human.getChild();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Human human: tree.values()){
            sb.append(human + "\n");
        }
        return sb.toString();
    }
    public Human findHuman(String name){
        for(Human human: this.tree.values()){
            if (name.equals(human.getFirstName())) return human;
        }
        return null;
    }
}
