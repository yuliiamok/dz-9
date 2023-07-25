package pack1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Man man1 = new Man("man1", "man1", 67, null);
        people.add(man1);
        Man man2 = new Man("man2", "man2", 36, null);
        people.add(man2);
        Woman woman1 = new Woman("woman1", "woman1", 62, man1);
        people.add(woman1);
        Woman woman2 = new Woman("woman2", "woman2", 35, man2);
        people.add(woman2);
        Woman woman3 = new Woman("woman3", "woman3", 18, null);
        people.add(woman3);

        System.out.println("Information about people: ");
        System.out.println(woman1.getInfo());
        System.out.println(man2.getInfo());

        woman1.registerPartnership(man1);
        System.out.println(woman1.toString());

        woman1.deregisterPartnership(true);
    }
}
