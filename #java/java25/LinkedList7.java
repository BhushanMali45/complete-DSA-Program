import java.util.*;


public class LinkedList7 {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // create head and tail
  public static Node head;
  public static Node tail;



 
////*********************** */
public static boolean isCycle(){
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;

             if(slow==fast){
                return true;//cycle exist

             }
    }
    return false; //cycle doesnt exist
}


  //main
  public static void main(String args[]) {
  

head=new Node(1);
head.next=new Node(2);
head.next.next=new Node(3);
head.next.next.next=head;

//1-2-3|
//|----

System.out.println(isCycle());//static manun as 



  


  }
}

