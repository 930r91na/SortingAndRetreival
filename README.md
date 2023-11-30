# SortingAndRetreival

## Project Objective
The aim of this project is to investigate various sorting and retrieval methods implementable in complex programming languages. These methods are crucial for programmers to efficiently sort data and expedite the information retrieval process.

## Part One: Implementation and Testing
The project involves implementing classes for each sorting and retrieval method, followed by testing with consistent test cases. The project structure and complete code are accessible in the [GitHub repository](https://github.com/930r91na/SortingAndRetreival.git). Each method's functions are reviewed before conducting comprehensive tests.

### Sorting Methods
Each sorting method class contains a private `Integer[] array` for sorting.

#### Selection Sort
Iterates over the array, finds the minimum element in the unsorted array, and swaps it with the first unsorted element. This process repeats until the array is sorted. Time complexity: O(N^2).

#### Bubble Sort
Employs two nested loops to compare and swap adjacent elements if needed. The process terminates early if no swaps are made in a pass, indicating the array is sorted. Time complexity: O(N^2).

#### Merge Sort
Divides the array into two halves, sorts them independently, and merges them. The process uses a recursive approach, dividing the array until subarrays contain single elements. Time complexity: O(log n).

#### Radix Sort
Sorts based on digit by digit, starting from the least significant digit. It relies on counting sort for sorting digits and iterates as many times as the number of digits in the largest value.

## Part Two: Investigation

### Retrieval Methods

#### Sequential Search
Searches each element linearly until the target is found or the end of the array is reached. Returns the index of the found element or -1 if not found.

#### Binary Search
Efficiently searches a sorted array by repeatedly dividing the search interval in half. Returns the index of the found element or -1 if not found. Time complexity: O(log n).

#### Hashing
Uses a hash function to map data to a fixed-size hash code, which is then used as an index in a hash table for storing and retrieving data.

#### Tree Search
Navigates through a tree structure (like binary search trees) to locate a particular node. Methods like depth-first search (DFS) and breadth-first search (BFS) are used based on the requirement.

## Testing
The main function creates an array with randomly ordered elements and applies each sorting and retrieval method, displaying the results. The handling of duplicates by these methods is also showcased.
