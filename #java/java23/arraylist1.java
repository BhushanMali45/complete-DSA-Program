import java.util.ArrayList;

public class arraylist1 {

  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(5);
    list.add(9);
     list.add(1);

     //add
list.add(2,45);

    System.out.println(list);

    //get operation
    int element=list.get(2);
    System.out.println(element);
    //delete operation
    list.remove(2);
    System.out.println(list);

    //set
    list.set(2,100);
    System.out.println(list);
//contains element
    System.out.println(list.contains(1));
    System.out.println(list.contains(10));



  }
}
