import java.util.*;

public class hepa6 {
    //iteration of hash set

    public static void main(String args[]){
 
        HashSet<String> set=new HashSet<>();

        set.add("pune");
        set.add("mumbai");
        set.add("banglore");


        for (String city : set) {
            System.out.println(city);
        }
    }
}
