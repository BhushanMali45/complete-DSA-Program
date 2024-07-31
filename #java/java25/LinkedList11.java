import java.util.*;

public class LinkedList11 {

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

  //mid
  private Node getMid(Node head) {
    Node slow = head;
    Node fast = head.next;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; //mid
  }

  //merge
  private Node merge(Node head1, Node head2) {
    Node mergedll = new Node(-1);
    Node temp = mergedll;

    while (head1 != null && head2 != null) {
      if (head1.data <= head2.data) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      } else {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
      }
    }

    while (head1 != null) {
      temp.next = head1;
      head1 = head1.next;
      temp = temp.next;
    }

    while (head2 != null) {
      temp.next = head2;
      head2 = head2.next;
      temp = temp.next;
    }

    return mergedll.next;
  }

  ///mergesort

  public Node mergeSort(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    //find mid
    Node mid = getMid(head);

    //left &right  merger sort
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    //merge
    return merge(newLeft, newRight);
  }

  public static void main(String args[]) {
    LinkedList11 ll = new LinkedList11();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.addFirst(4);
    ll.addFirst(5);
    //1-2-3-4--5
    ll.print();
    //o(nlogn)
    ll.head = ll.mergeSort(ll.head);

    ll.print();
  }
}
