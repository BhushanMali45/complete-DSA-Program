import java.util.*;

public class LinkedList13{
    public class Node{
        int data;
        Node next;
        Node prev;


        public Node (int data){
          this.data=data;
           this.next=null;
           this .prev=null;

        }
    }

public static Node head;
public static Node tail;
public static int size;


//addfirst
public void addFirst(int data){
  Node newNode=new Node(data); 
  size++;
  if(head==null){
    head=tail=newNode;
    return;
  }

  newNode.next=head;
  head.prev=newNode;
  head=newNode;

}


// //addLast
public void addLast(int data){
    Node newNode=new Node(data); 
    size++;
    if(tail==null){
      head=tail=newNode;
      return;
    }
  
    tail.next=newNode;
    newNode.prev=tail;
    tail=newNode;
  }


//remove first
public int removeFirst(){
if(head==null){
    System.out.println("dll is empty");
    return Integer.MIN_VALUE;
}


if(size==1){
    int val=head.data;
    head=tail=null; 
    size--;
    return val;
}
int val=head.data;
head=head.next;
head.prev=null;
size--;
return val;
}





// //remove last
public int removeLast(){
    if(head==null){
        System.out.println("dll is empty");
        return Integer.MIN_VALUE;
    }
    
    
    if(size==1){
        int val=head.data;
        head=tail=null; 
        size--;
        return val;
    }
    int val=tail.data;
    tail=tail.prev;
    tail.next=null;
    size--;
    return val;
    }


//print ddll
public void print(){
   Node temp=head;

   while(temp!=null){
    System.out.print(temp.data+" <--> ");
    temp=temp.next;
   } 
   System.out.println("null");
}



    public static void main(String args[]){
LinkedList13 dll=new LinkedList13();
dll.addFirst((3));
dll.addFirst((2));
dll.addFirst(1);

dll.print();
System.out.println(dll.size);


dll.removeFirst();
dll.removeLast();

dll.addLast(5);
dll.addLast(6);


dll.print();
System.out.println(dll.size);


    }
}