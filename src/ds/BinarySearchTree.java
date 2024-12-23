package ds;
class BinarySearchTree {
    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node
    void insert(int data) {
        root = insertRec(root, data);
    }

    // A recursive function to insert a new key in the BST
    Node insertRec(Node root, int data) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node(data);
            return root;
        }

        // Otherwise, recur down the tree
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        // return the (unchanged) node pointer
        return root;
    }

    // Method to delete a node
    void delete(int data) {
        root = deleteRec(root, data);
    }

    // A recursive function to delete a node in the BST
    Node deleteRec(Node root, int data) {
        // Base Case: If the tree is empty
        if (root == null) {
            return root;
        }

        // Recur down the tree
        if (data < root.data) {
            root.left = deleteRec(root.left, data);
        } else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    // A utility function to find the minimum value node in the given BST
    int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            root = root.left;
            minValue = root.data;
        }
        return minValue;
    }

    // Method to search for a value in the BST
    boolean search(int data) {
        return searchRec(root, data);
    }

    // A recursive function to search a key in the BST
    boolean searchRec(Node root, int data) {
        // Base Cases: root is null or the data is present at root
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }

        // Data is greater than root's data
        if (data < root.data)
            return searchRec(root.left, data);

        // Data is less than root's data
        return searchRec(root.right, data);
    }

    // This method mainly calls inorderRec()
    void inorder() {
        inorderRec(root);
    }

    // A utility function to do inorder traversal of BST
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert values into the BST
        int[] values = {10, 20, 30, 40, 50, 60};
        for (int value : values) {
            tree.insert(value);
        }

        // Print the inorder traversal of the BST
        System.out.print("Inorder traversal of the binary search tree: ");
        tree.inorder();
        System.out.println();

        // Search for a value in the BST
        int searchValue = 30;
        if (tree.search(searchValue)) {
            System.out.println(searchValue + " is present in the BST.");
        } else {
            System.out.println(searchValue + " is not present in the BST.");
        }

        // Delete a value from the BST
        tree.delete(30);
        System.out.print("Inorder traversal after deleting 30: ");
        tree.inorder();
        System.out.println();
    }
}