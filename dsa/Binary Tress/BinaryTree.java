
import java.util.*;


public class BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

        static class BinaryTrees{
               int idx= -1;

            public   Node buildTree(int nodes[]){
                      idx++;

                       if (nodes[idx] == -1) {
                return null;
            }
                      Node newNode=new Node(nodes[idx]);
                      newNode.left=buildTree(nodes);
                      newNode.right=buildTree(nodes);

                      return newNode;
                    }

                    //preporder
                    public  void preorder(Node root){
                        if(root==null){
                            return;

                        }

                        System.out.print(root.data);
                        preorder(root.left);
                        preorder(root.right);
                    }
        }
    }
    public static void main(String args[]){
        int nodes[]={ 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        
Node.BinaryTrees tree = new Node.BinaryTrees();//it gadbad aahe ssss
        Node root = tree.buildTree(nodes);
        tree.preorder(root);

    }
}





///class mandhi aahe manun Node dila