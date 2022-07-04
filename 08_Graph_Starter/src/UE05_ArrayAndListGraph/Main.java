package UE05_ArrayAndListGraph;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("*ArrayGraph*");
        ArrayGraph arrayGraph = new ArrayGraph(5, true);
        arrayGraph.addEdge(2,3,10);
        arrayGraph.addEdge(2,1, 20);

        List<WeightedEdge> list1 = arrayGraph.getEdges(2);
        if (list1 != null)
            System.out.println(list1.toString());

        System.out.println("*ListGraph*");
        ListGraph listGraph = new ListGraph(5, false);
        listGraph.addEdge(2,3,10);
        listGraph.addEdge(2,1, 20);
        listGraph.removeEdge(2,3);

        List<WeightedEdge> list2 = listGraph.getEdges(2);
        if (list2 != null)
            System.out.println(list2.toString());
    }
}
