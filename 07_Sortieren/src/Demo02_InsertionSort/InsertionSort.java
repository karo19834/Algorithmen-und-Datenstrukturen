package Demo02_InsertionSort;

public class InsertionSort {

    public void sort(int[] array)
    {
        int temp = 0;

        // Äußere Schleife
        for (int i = 1; i < array.length; i++)
        {
            // Innere Schleife
            for (int j = i; j > 0; j--)
            {
                // Tausch notwendig?
                if (array[j] < array[j-1])
                {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                // Wenn nicht, sind die restlichen Vergleiche in diesem Durchlauf nicht mehr notwendig
                else
                    break;
            }
        }
    }

}
