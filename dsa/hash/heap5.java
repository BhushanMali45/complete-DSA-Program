import java.util.*;

public class heap5 {
    //hashset


    public static void main(String args[]){
     
HashSet<Integer>set=new HashSet<>();
set.add(1);
set.add(2);
set.add(3);
set.add(2);//duplicate not allow

System.out.println(set);

set.remove(2);
System.out.println(set);

if(set.contains(3)){

System.out.println("present");
}
    }
}
