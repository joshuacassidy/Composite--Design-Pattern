public class Main {

    public static void main(String[] args) {

        Person grandfather = new Person("the grandfather");
        Person son = new Person("the son");
        Person daughter = new Person("the daughter");
        Person grandson = new Person("the grandson");
        Person granddaughter = new Person("the granddaughter");


        grandfather.add(son);
        grandfather.add(daughter);

        son.add(grandson);
        daughter.add(grandson);
        daughter.add(granddaughter);

        System.out.println(grandfather);
        for (Person children: grandfather.getChildren()) {
            System.out.println(children);
            for (Person grandChildren: children.getChildren()) {
                System.out.println(grandChildren);
            }

        }

    }
}
