import java.util.*;
public class graph1{
// create a graph 
        static class edge{
          
        int src;
        int des;
        int wt;

        public edge(int s,int d, int w){
            this.src=s;
            this.des=d;
            this.wt=w;
        }
        }



    public static void main(String args[]){
    int v=5;
    //int arr[]=new arr[v]
    ArrayList<edge>[] graph=new ArrayList[v];
    
    for(int i=0;i<v;i++){
        graph[i]=new ArrayList<>();
    }

    // 0vertex
    graph[0].add(new edge(0, 1, 5));
    

    //1vertex
    graph[1].add(new edge(1, 0, 5));

    graph[1].add(new edge(1, 2, 1));

 graph[1].add(new edge(1, 3, 3));

 //vertex 2
 graph[2].add(new edge(2, 1, 1));

    graph[2].add(new edge(2, 3, 1));

 graph[2].add(new edge(2, 4, 4));
 //vertex 3
  graph[3].add(new edge(3, 1, 3));

 graph[3].add(new edge(3, 2, 1));
 //vertex 4
  graph[4].add(new edge(4, 2, 2));

  //suppose we wanted to show the 2s neighbours

  for(int i=0;i<graph[2].size();i++){
edge e=graph[2].get(i);// src des wt
System.out.println(e.des);

  }
    }
}