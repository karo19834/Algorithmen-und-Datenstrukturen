package party;

import java.util.ArrayList;

public class Person {
    public String name;
    public ArrayList<Person> friends;

    public Person(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }
}
