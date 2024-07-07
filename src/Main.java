
public class Main {

    public static void main(String[] args) {
        int[] arr = {
                9,
                5,
                2,
                8,
                0,
                3,
                1,
                6
        };
        Sortable quickSort = new QuickSort();
        quickSort.sort(arr);
        System.out.print("Quick Sort (Descending Order): ");
        printArray(arr);
        int[] arr2 = {
                9,
                5,
                2,
                8,
                0,
                3,
                1,
                6
        }; 
        
        MergeSort mergeSort = new MergeSort();
        int[] array = {5, 8, 6, 9, 3, 1, 7};
        mergeSort.sort(array);
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }

    }

    private static void printArray(int[] arr) {

        for (int num: arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}