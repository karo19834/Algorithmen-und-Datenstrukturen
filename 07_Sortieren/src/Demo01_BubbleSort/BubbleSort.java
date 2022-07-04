package Demo01_BubbleSort;

public class BubbleSort {

    public void sort(int[] numbers)
    {
        for (int n = (numbers.length-1); n > 1; n--) {
            for (int i = 0; i < n; i++) {
                // Tauschen, wenn notwendig
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
    }

    public void printArray(String prefix, int[] numbers)
    {
        System.out.print(prefix);
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }






}
