package party;

import java.util.List;

public class Party {
    public static void main(String[] args) {
        Person andy = new Person("Andy");
        Person berta = new Person("Berta");
        Person charlie = new Person("Charlie");
        Person doris = new Person("Doris");
        Person eve = new Person("Eve");
        Person francis = new Person("Francis");
        Person guido = new Person("Guido");

        andy.friends.add(charlie);
        andy.friends.add(berta);
        berta.friends.add(andy);
        berta.friends.add(doris);
        berta.friends.add(charlie);
        berta.friends.add(francis);
        charlie.friends.add(andy);
        charlie.friends.add(berta);
        charlie.friends.add(doris);
        charlie.friends.add(eve);
        doris.friends.add(berta);
        doris.friends.add(charlie);
        eve.friends.add(charlie);
        francis.friends.add(berta);
        francis.friends.add(guido);
        guido.friends.add(francis);

        InnerCircle circle = new InnerCircle();

        System.out.println("--- Level 0 ---");
        List<Person> friends = circle.getFriends(andy, 0);
        for (Person p: friends) {
            System.out.println(p.name);
        }

        System.out.println("--- Level 1 ---");
        friends = circle.getFriends(andy, 1);
        for (Person p: friends) {
            System.out.println(p.name);
        }

        System.out.println("--- Level 2 ---");
        friends = circle.getFriends(andy, 2);
        for (Person p: friends) {
            System.out.println(p.name);
        }
    }
}
