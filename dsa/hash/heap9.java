
import java.util.*;
public class heap9 {
    //find iternary if the ticket


    public static String getStart(HashMap<String,String> tickets){
         HashMap<String ,String>reversemap=new HashMap<>();//to from


         for(String keys:tickets.keySet()){
            reversemap.put(tickets.get(keys),keys);

         }


          for(String keys:tickets.keySet()){
           if(!reversemap.containsKey(keys)){
            return keys;//starting point
           }
         }

         return null;
    }
    public static void main(String args[]){
    HashMap<String ,String>tickets=new HashMap<>();//from to

    tickets.put("chennai","bangaluru");
     tickets.put("mumbai","delhi");
      tickets.put("goa","chennai");
       tickets.put("delhi","goa");


       String start=getStart(tickets);
System.out.print(start);
       for (String keys : tickets.keySet()) {
        System.out.print("-->"+tickets.get(start));
        start=tickets.get(start);

       }
       System.out.println();




    }
}
