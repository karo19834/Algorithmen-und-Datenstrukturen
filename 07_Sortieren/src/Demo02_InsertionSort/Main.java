package Demo02_InsertionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = { 8,4,5,2,1,3,9,10,7,6 };
        InsertionSort sorter = new InsertionSort();

        System.out.println(Arrays.toString(array));
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
