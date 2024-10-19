package TreePersons;

import Humans.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class TreePerson implements Serializable, Iterable<Human> {
    private int ID = 1;
//    private int id;
//    private final HashMap<Integer, Human> tree ;
    private final ArrayList<Human> tree;

//    public TreePerson() {
//        this.tree = new HashMap<>();
//    }
    public TreePerson(){
        this.tree = new ArrayList<>();
    }

    public void addHuman(Human human){
        if (!(human.getId()>0) & !this.tree.contains(human)) {
            human.setId(ID);
            human.setId(ID++);
            this.tree.add(human);
        }
    }
    public void addHuman(Human[] humans){
        for (Human human: humans){
            addHuman(human);
        }
    }
    public ArrayList<Human> getChild(Human human){
        return human.getChild();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Human human: tree){
            sb.append(human).append(";\n");
        }
        return sb.toString();
    }
    public Human findHuman(String name){
        for(Human human: this.tree){
            if (name.equals(human.getFirstName())) return human;
        }
        return null;
    }

    @Override
    public Iterator<Human> iterator() {
        return new TreeIterator<>(this.tree);
    }
}
