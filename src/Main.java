public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {5, 8, 6, 9, 3, 1, 7};
        mergeSort.sort(array);
        System.out.print("Sorted List with MergeSort : ");
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }

    }
}