import java.util.*;
//valid bst
public class bst6 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left
            root.left = insert(root.left, val);
        } else {
            // right
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("null");
    }

    // root to leaf
    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(path);
        }
        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }





    //bst valid
    public static boolean isvalidBst(Node root, Node min ,Node max){
        if(root==null){
            return true;

        }
    if(min !=null && root.data <=min.data){
        return false;
    }
    else if(max !=null && root.data >=max.data){
        return false;
    }


    return isvalidBst(root.left, min, root) && isvalidBst(root.right, root, max);


    }

    public static void main(String args[]) {
        int values[] = { 8,5,3,1,4,6,10,11,14 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
        System.out.println();

        // printInRange(root, 5, 12);

        // printRootToLeaf(root, new ArrayList<>());

       if(isvalidBst(root, null, null)){
        System.out.println("validbst");
       }
       else{
                System.out.println(" not validbst");

       }
    }
}
