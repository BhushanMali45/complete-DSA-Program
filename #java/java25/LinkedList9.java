import java.util.LinkedList;
import java.util.*;


public class LinkedList9{
   
    

    public static void main(String args[]){
        //create -  object int ,float boolean ki jagah hame Integer Float Charecter class use karni he
        LinkedList<Integer>ll=new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);


        System.out.println(ll);


        //remove
        ll.removeLast();
        ll.removeFirst();
     System.out.println(ll);
    }
}
