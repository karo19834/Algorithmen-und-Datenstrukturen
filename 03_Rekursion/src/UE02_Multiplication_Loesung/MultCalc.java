package UE02_Multiplication_Loesung;

public class MultCalc {

    public int calcMultiplication(int multiplicand, int multiplier)
    {
        if (multiplier == 1)
            return multiplicand;
        else
            return multiplicand + calcMultiplication(multiplicand, multiplier-1);
    }
}
