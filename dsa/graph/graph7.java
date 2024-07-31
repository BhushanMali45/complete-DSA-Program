import java.util.*;

public class graph7 {

  //check bipartited
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

    graph[1].add(new edge(1, 0));

    graph[1].add(new edge(1, 3));

    graph[2].add(new edge(2, 0));

    graph[2].add(new edge(2, 4));

    graph[3].add(new edge(3, 1));
    // graph[3].add(new edge(3, 4));
    graph[4].add(new edge(4, 2));

    // graph[4].add(new edge(4, 3));
  }


 

 //
 public static boolean isBipartite(ArrayList<edge>graph[]){
int color[]=new int [graph.length];
for(int i=0;i<color.length;i++){
    color[i]=-1;//no color
}

//for all compoents  
Queue<Integer>q=new LinkedList<>();

for(int i=0;i<graph.length;i++){
    if(color[i]==-1){//bfs
q.add(i);
color[i]=0;//yelloew
while(!q.isEmpty()){
    int curr=q.remove();

  
        for(int j=0;j<graph[curr].size();j++){
            edge e=graph[curr].get(j);// e.des
          if(color[e.des]==-1){
            int nextcolor=color[curr]==0 ?1:0;
            color[e.des]=nextcolor;
            q.add(e.des);
          }else if(color[e.des]==color[curr]){
            return false;
          }
              }
    }
 }
    }
    return true;
}


  public static void main(String args[]) {


    int v=5;
    ArrayList<edge>graph[]=new ArrayList[v];
    creategraph(graph);
    System.out.println(isBipartite(graph));

  }
}
