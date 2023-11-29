import java.util.HashMap;
import java.util.Map;
public class Hashing {
    private Integer[] array;
    private int toSearch;

    // Getters and Constructors

    public Hashing(Integer[] array, int toSearch){
        this.array = array;
        this.toSearch = toSearch;
    }

    public int getToSearch(){
        return this.toSearch;
    }
    public Integer[] getArray(){
        return this.array;
    }

    // Hashing method to find the index of toSearch
    public Integer hashing() {
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Populate the hash table
        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], i);
        }

        // Retrieve the index of toSearch from the hash table
        return hashMap.get(toSearch); // This will return null if toSearch is not found
    }
}
