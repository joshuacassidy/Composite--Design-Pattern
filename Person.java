import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Person> children;

    public Person(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(Person person) {
        children.add(person);
    }

    public Person remove(Person person) {
        children.remove(person);
        return person;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
