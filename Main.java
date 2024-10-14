import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TreePerson familyTree = new TreePerson();
        Human daniil = new Human(new Date(1984, 8, 28), "Daniil", "Ermoshin", "male");
        Human kirill = new Human(new Date(1982, 3, 29), "Kirill", "Ermoshin", "male");
        Human pavel = new Human(new Date(1979, 11, 15), "Pavel", "Ermoshin", "male");
        Human alex = new Human(new Date(1988, 1, 31), "Alex", "Ermoshin", "male");
        Human fedor = new Human(new Date(1946, 6, 3), "Fedor", "Ermoshin", "male");
        Human tatyana = new Human(new Date(1950, 7, 26), "Tatyana", "Ermoshina", "female");
        Human dima = new Human(new Date(2012, 12, 23), "Dmitry", "Ermoshin", "male");
        Human yulia = new Human(new Date(2018, 2, 7), "Yulia", "Ermoshina", "female");
        Human sergey = new Human(new Date(2008, 11, 17), "Sergey", "Ermoshin", "male");
        Human evsey = new Human(new Date(2020, 03, 14), "Evsey", "Ermoshin", "male");
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
        familyTree.addHuman(daniil);
        familyTree.addHuman(kirill);
        familyTree.addHuman(pavel);
        familyTree.addHuman(fedor);
        familyTree.addHuman(tatyana);
        familyTree.addHuman(alex);
        familyTree.addHuman(dima);
        familyTree.addHuman(yulia);
        familyTree.addHuman(sergey);
        familyTree.addHuman(evsey);
        System.out.println(familyTree.getChild(daniil));


    }
}