package UE02_Multiplication;

public class MultCalc {

    public int calcMultiplication(int multiplicand, int multiplier)
    {
        // Multiplicand = 3 = Wert
        // Multiplier = 4 = Zähler

        // Abbruchbedingung
        if (multiplier == 0)
            return 0;
        else {
            // Logik
            return multiplicand + calcMultiplication(multiplicand, multiplier - 1);
        }
    }
}
