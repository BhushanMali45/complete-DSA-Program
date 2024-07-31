import java.util.*;

public class graph11 {

//all path from source to des
    static class edge{
        int src;
        int des;
        public edge(int s,int d){
            this.src=s;
            this.des=d;
        }
    }


    static void createGraph(ArrayList<edge>graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
          }
                  graph[0].add(new edge(0, 3));

          graph[2].add(new edge(2, 3));
      
          graph[3].add(new edge(3, 1));
      
          graph[4].add(new edge(4, 0));
      
          graph[4].add(new edge(4, 1));

                    graph[5].add(new edge(5, 0));

                  graph[5].add(new edge(5, 2));

    }
   

  //
  public static void printAllpath(ArrayList<edge>graph[],int src, int des, String path){
    if(src==des){
System.out.println(path+des);
return;
    }

    for(int i=0;i<graph[src].size();i++){
        edge e=graph[src].get(i);
        printAllpath(graph, e.des, des, path+src);
    }
  }


  
    public static void main(String args[]){
 int v=6;
 ArrayList<edge> graph[] = new ArrayList[v];
 createGraph(graph);
 int src=5,des=1;
printAllpath(graph, src, des, "");
    }
}
