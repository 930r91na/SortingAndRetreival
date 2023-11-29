public class SelectionSort {
    private Integer[] array;

    // Constructor
    public SelectionSort(Integer[] array) {
        this.array = array;
    }

    // Selection sort method
    public void selectionSort() {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Getter for the array
    public Integer[] getArray() {
        return this.array;
    }
}

