import java.util.*;
//o(n)
public class BinaryTree1 {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        // Constructor
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Binary tree class
    static class BinaryTrees {
        int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);//newnode banavat
            newNode.left = buildTree(nodes);//linked karayach kam
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTrees tree = new BinaryTrees();

        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
