import java.util.HashMap;

public class TreePerson {
    private int ID = 1;
    private int id;
    HashMap<Integer, Human> tree = new HashMap<>();
    public void addHuman(Human human){
        human.setId(ID);
        this.tree.put(ID++, human);
    }
}
