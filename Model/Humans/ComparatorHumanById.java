package Model.Humans;

import java.util.Comparator;

public class ComparatorHumanById implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getId() - o2.getId();
    }
}
