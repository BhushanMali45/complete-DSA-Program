import java.util.*;

public class hash1{
    public static void main(String args[]){
//create 
HashMap<String,Integer>hm=new HashMap<>();
//insert
hm.put("india",100);
hm.put("china",150);
hm.put("us",50);

System.out.println(hm);



//get
int population=hm.get("india");
System.out.println(population);

System.out.println(hm.get(" japan"));


//containsKey : key exist he kya nhi
System.out.println(hm.containsKey("india"));//true
System.out.println(hm.containsKey("japan"));


//remove
System.out.println(hm.remove("china"));;
System.out.println(hm);


//size
System.out.println(hm.size());

//isempty
System.out.println(hm.isEmpty());


//clear
hm.clear();
    }
}