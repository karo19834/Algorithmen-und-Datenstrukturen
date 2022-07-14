package tombola;

public class Tree
{
    private Node root;

    public Node getRoot()
    {
        return root;
    }

    public void buildExampleTree()
    {
        root = new Node(new Prize(53, "Taucherbrille"));

        Node r = new Node(new Prize(78, "Niete"));
        root.setRight(r);

        Node l = new Node(new Prize(45, "USB-Stick"));
        root.setLeft(l);

        Node ll = new Node(new Prize(40, "Tasse"));
        l.setLeft(ll);

        Node lr = new Node(new Prize(49, "Spritzpistole"));
        l.setRight(lr);

        Node rr = new Node(new Prize(90, "Pflanze"));
        r.setRight(rr);

        Node lll = new Node(new Prize(11, "Gummibaeren"));
        ll.setLeft(lll);

        Node rrl = new Node(new Prize(87, "Niete"));
        rr.setLeft(rrl);

        Node rl = new Node(new Prize(77, "Hut"));
        r.setLeft(rl);
    }

    public Prize searchForNumber(int number)
    {
        // links kleiner und rechts größer
        return searchForNumberRecursive(root, number).getPrize();
    }

    private Node searchForNumberRecursive(Node current, int winner){

        if (current == null)
            return null;

        int currentNumber = current.getPrize().getNumber();
        if (currentNumber == winner){
            return current;
        }else{
            // links kleiner und rechts größer
            if (winner < currentNumber)
                return searchForNumberRecursive(current.getLeft(), winner);
            else
                return searchForNumberRecursive(current.getRight(), winner);
        }
    }
}
