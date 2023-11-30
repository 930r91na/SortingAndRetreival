import java.util.Arrays;

class RadixSort {
    private Integer[] array;
    private int n;

    public RadixSort(Integer[] array) {
        this.array = array;
        this.n = array.length;
    }

    private int getMax() {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private void countSort(int exp) {
        int[] output = new int[n];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for (int i = 0; i < n; i++) {
            count[(array[i] / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[count[(array[i] / exp) % 10] - 1] = array[i];
            count[(array[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            array[i] = output[i];
        }
    }

    public void radixSort() {
        int m = getMax();

        for (int exp = 1; m / exp > 0; exp *= 10) {
            countSort(exp);
        }
    }

    public void sort() {
        radixSort();
    }
}
