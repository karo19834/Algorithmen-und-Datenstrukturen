package tombola;

public class Prize
{
    private final int number;
    private final String articleName;

    public Prize(int number, String articleName)
    {
        this.number = number;
        this.articleName = articleName;
    }

    public String getArticleName()
    {
        return articleName;
    }

    public int getNumber()
    {
        return number;
    }
}
