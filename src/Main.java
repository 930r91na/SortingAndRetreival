import com.sun.source.tree.Tree;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        // Sample array for testing
        Integer[] sampleArray = {5,8,9,2,3,1,4,6,7,0};

        // Print the sample array
        System.out.println("Sample Array: " + Arrays.toString(sampleArray));

        // Testing sorting algorithms
        System.out.println("Sorting Algorithms:");
        testSelectionSort(sampleArray.clone());
        testBubbleSort(sampleArray.clone());
        testMergeSort(sampleArray.clone());
        testRadixSort(sampleArray.clone());

        // Testing retrieval algorithms

        System.out.println("Retrieval Algorithms:");
        // Sorted array for binary search
        testBinarySearch(sampleArray.clone(), 6);

        //Unsorted array for sequential search and hashing
        testSequentialSearch(sampleArray.clone(), 6); // Assume we are searching for the number 6
        testHashing(sampleArray.clone(), 6);
        testTreeSearch(sampleArray.clone(), 6);
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
    private static void testRadixSort(Integer[] array) {
        RadixSort sorter = new RadixSort(array);
        sorter.radixSort();
        System.out.println("Radix Sort: " + Arrays.toString(array));
    }

    private static void testMergeSort(Integer[] array) {
        MergeSort sorter = new MergeSort(array);
        sorter.mergeSort();
        System.out.println("Merge Sort: " + Arrays.toString(array));
    }

    private static void testSequentialSearch(Integer[] array, int toSearch) {
        SequentialSearch searcher = new SequentialSearch(array, toSearch);
        int result = searcher.sequentialSearch();
        System.out.println("Sequential Search for " + toSearch + ": " + result + " (index)");
    }
    private static void testBinarySearch(Integer[] array, int toSearch) {
        // Ensure the array is sorted before applying binary search
        SelectionSort Arrays = new SelectionSort(array);
        Arrays.selectionSort();
        BinarySearch searcher = new BinarySearch(array, toSearch);
        int result = searcher.binarySearch();
        System.out.println("Binary Search for " + toSearch + ": " + result+ " (index)");
    }
    private static void testHashing(Integer[] array, int toSearch) {
        Hashing hasher = new Hashing(array, toSearch);
        Integer result = hasher.hashing();
        System.out.println("Hashing for " + toSearch + ": " + result + " (index)");
    }

    private static void testTreeSearch(Integer[] array, int toSearch) {
        TreeSearch tree = new TreeSearch(array, toSearch);
        Integer result = tree.treeSearch();
        System.out.println("Tree search for " + toSearch + ": " + result + " (index)");
    }
    /*

        private static void testQuickSort(Integer[] array) {
        QuickSort sorter = new QuickSort(array);
        sorter.quickSort();
        System.out.println("Quick Sort: " + Arrays.toString(array));
        }




    }*/







}
