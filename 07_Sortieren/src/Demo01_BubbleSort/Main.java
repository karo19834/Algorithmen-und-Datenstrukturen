package Demo01_BubbleSort;

public class Main {

    public static void main(String[] args) {
        int[] numbers = { 5,9,1,2,6,10,3,4,8,7 };
        BubbleSort sorter = new BubbleSort();

        sorter.printArray("Array before sorting: ", numbers);
        sorter.sort(numbers);
        sorter.printArray("Array after sorting: ", numbers);
    }
}
