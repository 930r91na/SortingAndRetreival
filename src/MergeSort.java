public class MergeSort {
    private Integer[] array;

    // Constructor
    public MergeSort(Integer[] array) {
        this.array = array;
    }

    // Public method to start the merge sort
    public void mergeSort() {
        int length = array.length;
        if (length < 2) {
            return; // The array is already sorted if it's less than 2
        }
        mergeSort(0, length - 1);
    }

    // Recursive method for merge sort
    private void mergeSort(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(low, mid);
            mergeSort(mid + 1, high);

            merge(low, mid, high);
        }
    }

    // Method to merge two sorted halves
    private void merge(int low, int mid, int high) {
        Integer[] temp = new Integer[high - low + 1];

        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = array[i++];
        }

        while (j <= high) {
            temp[k++] = array[j++];
        }

        System.arraycopy(temp, 0, array, low, temp.length);
    }
}
