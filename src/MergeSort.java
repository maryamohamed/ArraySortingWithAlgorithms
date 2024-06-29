public class MergeSort implements Sortable {

    @Override
    public void sort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength <= 1) return;

        int arrayMid = arrayLength / 2;
        int[] leftArray = new int[arrayMid];
        int[] rightArray = new int[arrayLength - arrayMid];

        // copy data into leftArray and rightArray
        for (int i = 0; i < arrayLength; i++) {
            if (i < arrayMid) {
                leftArray[i] = array[i];
            } else {
                rightArray[i - arrayMid] = array[i];
            }
        }

        // Recursively sort each half
        sort(leftArray);
        sort(rightArray);

        // Merge the sorted halves
        merge(leftArray, rightArray, array);
    }

    public void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0; // indexes

        // Merge in descending order
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] > rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        // Copy remaining elements of leftArray
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        // Copy remaining elements of rightArray
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
