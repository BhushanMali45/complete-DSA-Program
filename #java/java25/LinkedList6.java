import java.util.*;

// import javax.naming.NamingEnumeration;

public class LinkedList6 {

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



/////////////////////////////////////////////
//slow fast approach
public Node findmid(Node head){//helper
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
    }
    return slow;  //mid

}



//check palindrome
public boolean checkpalindrome(){

    if(head==null  || head.next==null){
        return true;
    }
    //step1 to find a mid
Node midNode=findmid(head);

    //step2 reverse 2nd half
Node prev=null;
Node curr=midNode;
Node next;

while(curr!=null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
Node right=prev;//right half ka head
Node left=head;//left half starting cha

    //step3 checl lefthalf==right half

    while(right!=null){
        if(left.data !=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
    }

    return true;

}









  //main
  public static void main(String args[]) {
    LinkedList6 ll= new LinkedList6();

    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addFirst(1);
    ll.print();

    
    ll.addLast(2);
    ll.print();
    ll.addLast(1);

    ll.print();

  

    System.out.println(ll.checkpalindrome());


  }
}

