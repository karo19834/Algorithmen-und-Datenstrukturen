package party_Unterricht;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InnerCircle {
    public List<Person> getFriends(Person person, int level) {

        ArrayList<Person> result = new ArrayList<>();  // visited in Folien genannt
        HashMap<Person, Integer> distance = new HashMap<>();
        ArrayDeque<Person> queue = new ArrayDeque<>();

        queue.add(person);
        distance.put(person, 0);

        while (!queue.isEmpty()) {
            // Liefern des ersten Elements aus Queue und löschen aus der Queue
            Person current = queue.remove();  // beim 1. Durchlauf = Andy
            result.add(current);

            // Wenn die gesuchte Distanz erreicht ist, interessieren mich
            // die Nachbarn nicht mehr.
            // Alternative: Nicht abfragen, alles reinspeichern und dann aussortieren
            if (distance.get(current) == level)
                continue;

            // In current.friends beim 1. Durchlauf die Freunde von Andy gespeichert
            for (Person friend: current.friends) {
                // Prüfen, ob man Person schon besucht hat, dann überspringen
                if (result.contains(friend))
                    continue;

                queue.add(friend);
                distance.put(friend, distance.get(current) + 1);
            }
        }

        return result;
    }
}
