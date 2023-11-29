public class SequentialSearch {
    private Integer[] array;
    private int toSearch;

    // Getters and constructors
    public SequentialSearch(Integer[] array, int toSearch) {
        this.array = array;
        this.toSearch = toSearch;
    }

    public int getToSearch(){
        return this.toSearch;
    }

    public Integer[] getArray(){
        return this.array;
    }
    public int sequentialSearch() {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(getToSearch())) {
                return i; // Return the index of the found element
            }
        }
        return -1; // Return -1 if the element is not found
    }
}
