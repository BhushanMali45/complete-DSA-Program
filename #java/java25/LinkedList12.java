import java.util.*;

public class LinkedList12{

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

  // methods  o(1)
  public void addFirst(int data) {
    // step 1=create a new node
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }
    // steps 2: newnode next=head
    newNode.next = head; // link

    // steps 3: head=newnode
    head = newNode;
  }

  // print the linked list
  public void print() {
    if (head == null) {
      System.out.println("Linked list is empty");
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }





public void zigzag(){
//find mid
Node slow=head;
Node fast=head.next;
while(fast!=null &&fast.next!=null){
  slow=slow.next;
  fast=fast.next.next;
}
Node mid =slow;

//reverse 2nd half
Node curr =mid.next;
mid.next=null;

Node prev=null;
Node next;

while(curr!=null){
  next=curr.next;
  curr.next=prev;
  prev=curr;
  curr=next;
}

Node left=head;
Node right=prev;
Node nextL,nextR;

//alt merge --zigzag merge
while(left!=null && right!=null){
nextL=left.next;
left.next=right;
nextR=right.next;
right.next=nextL;
//
left=nextL;
right=nextR;
}

}









  public static void main(String args[]) {
    LinkedList12 ll = new LinkedList12();
    ll.addFirst(5);
    ll.addFirst(4);
    ll.addFirst(3);
    ll.addFirst(2);
    ll.addFirst(1);
    //1-2-3-4--5
    ll.print();
    ll.zigzag();

    ll.print();
  }
}
