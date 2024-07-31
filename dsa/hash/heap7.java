import java.util.*;

public class heap7 {
    //count distinct element
    //imp


    public static void main(String args[]){
        int num[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer>set=new HashSet<>();

        for(int i=0;i<num.length;i++){
            set.add(num[i]);
        }

        System.out.println("size of set"+set.size());
      

    }
}
