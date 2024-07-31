import java.util.ArrayList;
import java.util.Collections;

public class arraylist4 {



    public static void main(String args[]){
       ArrayList<Integer> list =new ArrayList<>();
       list.add(1);
       list.add(5);
       list.add(9);
       list.add(3);
       list.add(6);


       System.out.println(list);
       Collections.sort(list);//ascend
       System.out.println(list);


       //descending
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);

       


    }
}
