public class TreeSearch {
    private Integer[] array;
    private int toSearch;

    // Constructor
    public TreeSearch(Integer[] array, int toSearch) {
        this.array = array;
        this.toSearch = toSearch;
        createTree();
    }

    // Node class for the BST
    private class Node {
        int value;
        int index; // Stores the original index from the array
        Node left, right;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
            left = right = null;
        }
    }


    private Node root;

    // Method to insert a value into the BST
    private Node insert(Node root, int value, int index) {
        if (root == null) {
            return new Node(value, index);
        }
        if (value < root.value) {
            root.left = insert(root.left, value, index);
        } else if (value > root.value) {
            root.right = insert(root.right, value, index);
        }
        return root;
    }


    // Method to build the BST from the array
    public void createTree() {
        for (int i = 0; i < array.length; i++) {
            root = insert(root, array[i], i);
        }
    }


    // Tree search method
    public int treeSearch() {
        return search(root, toSearch);
    }

    // Recursive method to search in the BST
    private int search(Node root, int toSearch) {
        if (root == null) {
            return -1; // Not found
        }
        if (root.value == toSearch) {
            return root.index; // Found, return the index
        }
        return toSearch < root.value ? search(root.left, toSearch) : search(root.right, toSearch);
    }

}
