
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class greedy7 {

    static class job{
        int deadline;
        int profit;
        int id;//0(a),1(b)

        public job (int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }

    public static void main(String args[]){
int jobINfo[][]={{4,20},{1,10},{1,40},{1,30}};


ArrayList<job>jobs=new ArrayList<>();

for(int i=0;i<jobINfo.length;i++){


    jobs.add(new job(i,jobINfo[i][0],jobINfo[i][1]));
   
}

Collections.sort(jobs,(obj1,obj2)-> obj2.profit-obj1.profit);//desce


ArrayList<Integer> seq=new ArrayList<>();
int  time=0;

for(int i=0;i<jobs.size();i++){
    job curr=jobs.get(i);

    if(curr.deadline >time){
        seq.add(curr.id);
        time++;

    }
}


//print
System.out.println("max jobs "+ seq.size());


for(int i=0;i<seq.size();i++){
    System.out.print(seq.get(i)+ " ");
}
System.out.println();
    }}