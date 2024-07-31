import java.util.*;

// import javax.naming.NamingEnumeration;

public class LinkedList5 {

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
  //for size
  public static int size;


  // methods  o(1)
  public void addFirst(int data) {
    // step 1=create a new node
    Node newNode = new Node(data);
    size++;

    if (head == null) {
      head = tail = newNode;
      return;
    }
    // steps 2: newnode next=head
    newNode.next = head; // link

    // steps 3: head=newnode
    head = newNode;
  }

  // add last  o(1)
  public void addLast(int data) {
    // step 1: create a new node
    Node newNode = new Node(data);
     size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step 2
    tail.next = newNode;
    // step 3
    tail = newNode;
  }




  //add in the middle o(n)
  public void add(int idx,int data){

    if(idx==0){
      addFirst(data);
      return;
    }
    Node newnoNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<idx-1){
      temp=temp.next;
      i++;

  
    }


    //i=idx-1; temp-->prev

    newnoNode.next=temp.next;
    temp.next=newnoNode;
  }

//methods
public int removeFirst(){

    if(size==0){
       System.out.println("Linked list is empty");
       return Integer.MIN_VALUE;

    }else if(size==1){
int val=head.data;
head=tail=null;
size=0;
return val;
    }
    int val=head.data;
    head=head.next;
    size--;
    return val;
}


//remove last
public int removeLast(){
  if(size==0){
    System.out.println("Linked list is empty");
    return Integer.MIN_VALUE;
  }
else if(size==1){
    int val=head.data;
head=tail=null;
size=0;
return val;
}

//prev i =size -2
Node prev=head;
for (int i=0;i<size-2;i++){
    prev=prev.next;

}
int val =prev.next.data;//tail.data
prev.next=null;
tail=prev;
size--;
return val;

}

  // print the linked list
  public void print(){
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



////find and remove from nth node 
public void deleteNthfeomEnd(int n){
    //calculate size
    int size=0;
    Node temp=head;
    while(temp!=null){
        temp=temp.next;
        size++;
    }


if(n==size){
    head=head.next;//remove first
    return;
}


//size -n
int i=1;
int itoFind=size-n;
Node prev=head;

while(i<itoFind){
    prev=prev.next;
    i++;
}
prev.next=prev.next.next;
return;


}










  //main
  public static void main(String args[]) {
    LinkedList5 ll= new LinkedList5();

    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();

    
    ll.addLast(3);
    ll.print();
    ll.addLast(4);

    ll.print();

    // //for middle
    // ll.add(2,9);
    // ll.print();


    //
//     System.out.print(size);
//    System.out.println();
  

    // ll.removeFirst();
    // ll.print();



    // ll.removeLast();
    // ll.print();



    // System.out.println(ll.recsearch(3));
    // System.out.println(ll.recsearch(10));



    // System.out.println(ll.itrsearch(3));
    // System.out.println(ll.itrsearch(10));

    // ll.revese();
    // ll.print();



    ll.print();
    ll.deleteNthfeomEnd(3);
    ll.print();


  }
}

