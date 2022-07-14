package polonaise;

public class Polonaise
{
    public static void main(String[] args)
    {
        DanceDoubleLinkedList polonaise = new DanceDoubleLinkedList();

        polonaise.insertDancerAtFirstPos("Maria");
        polonaise.insertDancerAtFirstPos("Stefan");
        polonaise.insertDancerAtFirstPos("Carmen");
        polonaise.insertDancerAtFirstPos("Udo");

        System.out.println("[Ist] Erste(r) TaenzerIn: " + getNameOfNode(polonaise.getFirst()) + "; [Soll] Udo");
        System.out.println("[Ist] Zweite(r) TaenzerIn: " + (polonaise.getFirst() == null ? "NULL" : getNameOfNode(polonaise.getFirst().getNext())) + "; [Soll] Carmen");
        System.out.println("[Ist] Vorletzte(r) TaenzerIn: " + (polonaise.getLast() == null ? "NULL" : getNameOfNode(polonaise.getLast().getPrev())) + "; [Soll] Stefan");
        System.out.println("[Ist] Letze(r) TaenzerIn: " + getNameOfNode(polonaise.getLast()) + "; [Soll] Maria");
    }

    private static String getNameOfNode(Node node)
    {
        if (node == null)
            return "NULL";
        else
            return node.getName();
    }
}
