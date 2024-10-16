import java.io.*;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreePerson familyTree = new TreePerson();
        Human daniil = new Human(LocalDate.of(1984, 8, 28), "Daniil", "Ermoshin", "male");
        Human kirill = new Human(LocalDate.of(1982, 3, 29), "Kirill", "Ermoshin", "male");
        Human pavel = new Human(LocalDate.of(1979, 11, 15), "Pavel", "Ermoshin", "male");
        Human alex = new Human(LocalDate.of(1988, 1, 31), "Alex", "Ermoshin", "male");
        Human fedor = new Human(LocalDate.of(1946, 6, 3), "Fedor", "Ermoshin", "male");
        Human tatyana = new Human(LocalDate.of(1950, 7, 26), "Tatyana", "Ermoshina", "female");
        Human dima = new Human(LocalDate.of(2012, 12, 23), "Dmitry", "Ermoshin", "male");
        Human yulia = new Human(LocalDate.of(2018, 2, 7), "Yulia", "Ermoshina", "female");
        Human sergey = new Human(LocalDate.of(2008, 11, 17), "Sergey", "Ermoshin", "male");
        Human evsey = new Human(LocalDate.of(2020, 3, 14), "Evsey", "Ermoshin", "male");
        daniil.setFather(fedor);
        daniil.setMother(tatyana);
        kirill.setFather(fedor);
        kirill.setMother(tatyana);
        pavel.setFather(fedor);
        pavel.setMother(tatyana);
        alex.setFather(fedor);
        alex.setMother(tatyana);
        dima.setFather(daniil);
        yulia.setFather(daniil);
        sergey.setFather(pavel);
        evsey.setFather(alex);
        Human[] humans = {daniil, kirill, pavel, fedor, tatyana, alex, dima, yulia, sergey, evsey};
        familyTree.addHuman(humans);
        System.out.println(familyTree.getChild(daniil));
        System.out.println("This is original tree:");
        System.out.println(familyTree);
        FileOperations fo = new FileOperations();
        try {
            fo.saveFile(familyTree, "src/treeFamily.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
        TreePerson newTree = null;
        try {
            newTree = fo.loadTree("src/treeFamily.txt");
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("This is loaded tree:");
        if (!(newTree == null)) {
            System.out.println(newTree);
        }
    }
}