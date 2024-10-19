package TreePersons;

import java.util.HashMap;
import java.util.Iterator;

public class TreeIterator<Human> implements Iterator<Human> {
    private HashMap<Integer, Human> tree;
    Integer index = 1;
    public TreeIterator(HashMap<Integer, Human> tree){
        this.tree = tree;
    }


    @Override
    public boolean hasNext() {
        return index <= tree.size();
    }

    @Override
    public Human next() {
        return tree.get(index++);
    }
}
