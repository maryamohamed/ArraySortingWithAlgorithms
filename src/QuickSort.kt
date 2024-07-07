
internal class QuickSort : Sortable {
    override fun sort(array: IntArray) {
        quickSort(array, 0, array.size - 1)
    }

    private fun quickSort(array: IntArray, low: Int, high: Int) {
        if (low < high) {
            val partitionIndex = partition(array, low, high)


            quickSort(array, low, partitionIndex - 1)
            quickSort(array, partitionIndex + 1, high)
        }
    }

    private fun partition(array: IntArray, low: Int, high: Int): Int {
        val pivot = array[high]
        var i = low - 1

        for (j in low until high) {
            if (array[j] >= pivot) {
                i++
                val temp = array[i]
                array[i] = array[j]
                array[j] = temp
            }
        }
        val temp = array[i + 1]
        array[i + 1] = array[high]
        array[high] = temp

        return i + 1
    }
}