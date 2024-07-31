import java.util.*;
public class heap2{

  
    static class student  implements Comparable<student>{//overriding 
        String name;
        int rank;

        public student(String name,int rank){
            this.rank=rank;
            this.name=name;
        }

@Override
public int compareTo(student s2){
     return this.rank -s2.rank;}

    }
    


public static void main(String args[]){
PriorityQueue <student> pq=new PriorityQueue<>();

pq.add(new student("a", 4));// o(logn)
pq.add(new student("b", 3));
pq.add(new student("c", 8));
pq.add(new student("d", 1));



while (!pq.isEmpty()){
    System.out.println(pq.peek().name + "---> "+pq.peek().rank); //0(1)
    pq.remove();//0(logn)
}
}
}
