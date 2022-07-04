package UE06_BreadthFirstSearch_Loesung;
import UE06_BreadthFirstSearch_Loesung.Tree.Tree;

public class TestBreadthFirstSearch {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(25);
        tree.add(20);
        tree.add(75);
        tree.add(15);
        tree.add(30);
        tree.add(80);

        // Wie sieht Baum aus?
        //        25
        //      /    \
        //     20    75
        //    /     /  \
        //  15     30  80

        System.out.println("Soll-Ergebnis: 25, 20, 75, 15, 30, 80");
        tree.performBreadthFirstSearch();
    }

}
