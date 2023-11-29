public class BubbleSort {
    private Integer[] array;

    // Constructor
    public BubbleSort(Integer[] array) {
        this.array = array;
    }

    // Bubble sort method
    public void bubbleSort() {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no two elements were swapped by inner loop, break
            if (!swapped)
                break;
        }
    }

    // Getter for the array
    public Integer[] getArray() {
        return this.array;
    }
}
