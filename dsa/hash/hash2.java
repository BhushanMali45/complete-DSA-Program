import java.util.*;

public class hash2 {
    //iteration on hash map
    public static void main(String args[]){
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india", 100);
        hm.put("china", 150);
        hm.put("us", 50);
        hm.put("uk", 10);


        //iterate
        Set<String>keys=hm.keySet();//
        System.out.println(keys);


        //for ecah loop to iterate on array
        for (String k: keys) {
            System.out.println("keys"+k+" ,"+"value"+hm.get(k));
            
        }
    }
}
