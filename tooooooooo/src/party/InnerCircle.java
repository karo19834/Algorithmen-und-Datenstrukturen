package party;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InnerCircle {
    public List<Person> getFriends(Person person, int level) {
        ArrayList<Person> result = new ArrayList<>();
        HashMap<Person, Integer> distance = new HashMap<>();
        ArrayDeque<Person> queue = new ArrayDeque<>();

        queue.add(person);
        distance.put(person, 0);

        while (!queue.isEmpty()) {
            Person cur = queue.remove();
            result.add(cur);
            if (distance.get(cur) == level) {
                continue;
            }
            for (Person f: cur.friends) {
                if (distance.containsKey(f)) {
                    continue;
                }
                queue.add(f);
                distance.put(f, distance.get(cur) + 1);
            }
        }

        return result;
    }
}
