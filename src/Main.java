import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Sample array for testing
        Integer[] sampleArray = {5, 3, 6, 2, 10, 4};

        // Testing sorting algorithms
        testSelectionSort(sampleArray.clone());
        testBubbleSort(sampleArray.clone());
        //testMergeSort(sampleArray.clone());
        //testQuickSort(sampleArray.clone());
        //testRadixSort(sampleArray.clone());

        // Testing retrieval algorithms
        testSequentialSearch(sampleArray.clone(), 6); // Assume we are searching for the number 6
        testBinarySearch(sampleArray.clone(), 6);
        testHashing(sampleArray.clone(), 6);
    }

    private static void testSelectionSort(Integer[] array) {
        SelectionSort sorter = new SelectionSort(array);
        sorter.selectionSort();
        System.out.println("Selection Sort: " + Arrays.toString(array));
    }

    private static void testBubbleSort(Integer[] array) {
        BubbleSort sorter = new BubbleSort(array);
        sorter.bubbleSort();
        System.out.println("Bubble Sort: " + Arrays.toString(array));
    }

    /*
    private static void testMergeSort(Integer[] array) {
        MergeSort sorter = new MergeSort(array);
        sorter.mergeSort();
        System.out.println("Merge Sort: " + Arrays.toString(array));

        private static void testQuickSort(Integer[] array) {
        QuickSort sorter = new QuickSort(array);
        sorter.quickSort();
        System.out.println("Quick Sort: " + Arrays.toString(array));
        }

        private static void testRadixSort(Integer[] array) {
        RadixSort sorter = new RadixSort(array);
        sorter.radixSort();
        System.out.println("Radix Sort: " + Arrays.toString(array));
        }


    }*/


    private static void testSequentialSearch(Integer[] array, int toSearch) {
        SequentialSearch searcher = new SequentialSearch(array, toSearch);
        int result = searcher.sequentialSearch();
        System.out.println("Sequential Search for " + toSearch + ": " + result);
    }
    private static void testBinarySearch(Integer[] array, int toSearch) {
        // Ensure the array is sorted before applying binary search
        Arrays.sort(array);
        BinarySearch searcher = new BinarySearch(array, toSearch);
        int result = searcher.binarySearch();
        System.out.println("Binary Search for " + toSearch + ": " + result);
    }
    private static void testHashing(Integer[] array, int toSearch) {
        Hashing hasher = new Hashing(array, toSearch);
        Integer result = hasher.hashing();
        System.out.println("Hashing for " + toSearch + ": " + result);
    }




}
