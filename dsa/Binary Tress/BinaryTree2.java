import java.util.*;

public class BinaryTree2 {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTrees {

    int idx = -1;

    public Node buildTree(int Nodes[]) {
      idx++;
      if (Nodes[idx] == -1) {
        return null;
      }

      Node newNode = new Node(Nodes[idx]);
      newNode.left = buildTree(Nodes);
      newNode.right = buildTree(Nodes);
      return newNode;
    }

    // preorder
    public static void preorder(Node root) {
      if (root == null) {
        return;
      }

      System.out.print(root.data + " ");
      preorder(root.left);
      preorder(root.right);
    }

    //inorder

    public static void inorder(Node root) {
      if (root == null) {
        return;
      }
      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }

    //postorder

    public static void postorder(Node root) {
      if (root == null) {
        return;
      }
      postorder(root.left);
      postorder(root.right);

      System.out.print(root.data + " ");
    }

    //level order
    public static void levelorder(Node root) {
      if (root == null) {
        return;
      }
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);

      while (!q.isEmpty()) {
        Node currNode = q.remove();
        if (currNode == null) {
          System.out.println();

          if (q.isEmpty()) {
            break;
          }
           else {
            q.add(null);
          }

        }
        
        else {
          System.out.print(currNode.data + " ");

          if (currNode.left != null) {
            q.add(currNode.left);
          }

          if (currNode.right != null) {
            q.add(currNode.right);
          }
        }
      }
    }
  }

  public static void main(String args[]) {
    int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    BinaryTrees tree = new BinaryTrees();
    Node root = tree.buildTree(Nodes);
    tree.preorder(root);
    System.out.println();

    tree.inorder(root);

    System.out.println();
    tree.postorder(root);

    System.out.println();
    tree.levelorder(root);
  }
}
