import java.util.HashMap;

public class TreePerson {
    private int ID = 1;
    private int id;
    private HashMap<Integer, Human> tree ;

    public TreePerson() {
        this.tree = new HashMap<>();
    }

    public void addHuman(Human human){
        human.setId(ID);
        this.tree.put(ID++, human);
    }
    public HashMap<Integer, Human> getChild(Human human){
        return human.getChild();
    }
}
