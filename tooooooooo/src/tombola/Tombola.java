package tombola;

public class Tombola
{
    public static void main(String[] args)
    {
        Tree tombola = new Tree();

        tombola.buildExampleTree();

        printResult(tombola.searchForNumber(53), "Taucherbrille");
        printResult(tombola.searchForNumber(87), "Niete");
        printResult(tombola.searchForNumber(90), "Pflanze");
        printResult(tombola.searchForNumber(11), "Gummibaeren");
        printResult(tombola.searchForNumber(77), "Hut");
    }

    private static void printResult(Prize foundPrize, String expectedArticleName)
    {
        System.out.print("Nummer: " + (foundPrize == null ? "NULL" : foundPrize.getNumber()) + " - ");
        System.out.print("[Ist] ");
        System.out.print((foundPrize == null ? "NULL" : foundPrize.getArticleName()) + " ");
        System.out.println("[Soll] " + expectedArticleName);
    }
}
