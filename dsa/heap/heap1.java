import java.util.*;
public class heap1{

    
public static void main(String args[]){
PriorityQueue <Integer> pq=new PriorityQueue<>();

pq.add(3);// o(logn)
pq.add(4);
pq.add(1);
pq.add(7);



while (!pq.isEmpty()){
    System.out.println(pq.peek()); //0(1)
    pq.remove();//0(logn)
}
}
}