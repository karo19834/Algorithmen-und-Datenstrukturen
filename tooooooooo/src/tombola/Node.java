package tombola;

public class Node
{
    private Prize prize;
    private Node left;
    private Node right;

    public Node(Prize prize)
    {
        this.prize = prize;
        left = null;
        right = null;
    }

    public Prize getPrize()
    {
        return prize;
    }

    public void setPrize(Prize prize)
    {
        this.prize = prize;
    }

    public Node getLeft()
    {
        return left;
    }

    public void setLeft(Node left)
    {
        this.left = left;
    }

    public Node getRight()
    {
        return right;
    }

    public void setRight(Node right)
    {
        this.right = right;
    }
}
