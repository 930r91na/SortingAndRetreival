public class BinarySearch {
    private Integer[] array;
    private int toSearch;

    // Getters and Constructors

    public BinarySearch(Integer[] array, int toSearch){
        this.array = array;
        this.toSearch = toSearch;
    }

    public int getToSearch(){
        return this.toSearch;
    }
    public Integer[] getArray(){
        return this.array;
    }

    public int binarySearch() {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midVal = array[mid];

            if (midVal < toSearch) {
                low = mid + 1;
            } else if (midVal > toSearch) {
                high = mid - 1;
            } else {
                return mid; // Key found
            }
        }
        return -1; // Key not found
    }
}
