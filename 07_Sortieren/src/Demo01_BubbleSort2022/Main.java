package Demo01_BubbleSort2022;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 5,3,9,4,1,2,8,6 };
        BubbleSort sorter = new BubbleSort();

        System.out.println(Arrays.toString(numbers));
        sorter.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
