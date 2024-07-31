import java.util.*;

public class graph6 {

  //cycle detection defs
  static class edge {

    int src;
    int des;

    public edge(int s, int d) {
      this.src = s;
      this.des = d;
    }
  }

  //create graph
  public static void creategraph(ArrayList<edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    graph[0].add(new edge(0, 1));
    graph[0].add(new edge(0, 2));

    graph[0].add(new edge(0, 3));

    graph[0].add(new edge(1, 0));

    graph[0].add(new edge(1, 2));

    graph[0].add(new edge(2, 0));

    graph[0].add(new edge(2, 1));
    graph[0].add(new edge(3, 0));
    graph[0].add(new edge(3, 4));

    graph[0].add(new edge(4, 3));
  }


  //cycle detection
  public static boolean cycledetection(ArrayList<edge>[]graph){
    boolean vis []=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
        if(!vis[i]){
             
            if(detectcycleutil(graph,i,vis,-1)){
                   return true;
                   //cycle exits in one of the part
            }

        }
    }
return false;
  }

  //detectcycleutil
  public static boolean detectcycleutil(ArrayList<edge>graph[],int curr,boolean vis[],int parent){
       vis[curr]=true;

       for(int i=0;i<graph[curr].size();i++){
        edge e=graph[curr].get(i);
        //case 3
        if(!vis[e.des] ){

            if(detectcycleutil(graph,e.des,vis,curr)){
                return true;
            }
             
        }
        //case 1
        else if(vis[e.des]&&  e.des != parent){
            return true;
        }
        //case  2 do nothing  continue 
       }
return false;
  }


  public static void main(String args[]) {


    int v=5;
    ArrayList<edge>graph[]=new ArrayList[v];
    creategraph(graph);
    System.out.println(cycledetection(graph));

  }
}
