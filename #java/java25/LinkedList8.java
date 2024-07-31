import java.util.*;


public class LinkedList8 {

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





//*********************** */
public static void removeCycle(){
    //detect cycle
     Node slow=head;
     Node fast=head;
      boolean cycle=false;
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;



        if(slow==fast){
            cycle=true;//cycle exist
            break;

         }
     } 

     if(cycle==false){
        return;
     }



    //finds meeting point
  slow=head;
   Node prev=null;
  while(slow!=fast){
      prev=fast;
      slow=slow.next;
      fast=fast.next;
  }


    //remove cycle  last.next=null;
  prev.next=null;
}

  //main
  public static void main(String args[]) {
  

head=new Node(1);
Node temp=new Node(2);
head.next=temp;

head.next.next=new Node(3);
head.next.next.next=temp;

//1-2-3|
//|----

System.out.println(isCycle());//static manun as 
//  LinkedList8.removeCycle();
removeCycle();
System.out.println(isCycle());



  


  }
}

