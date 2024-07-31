import java.util.*;
public class graph3{
// create a dfs 
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


        static void createGraph(ArrayList<edge>graph[]){
            for(int i=0;i<graph.length;i++){
                graph[i]=new ArrayList<>();
            }
                graph[0].add(new edge(0, 1, 1));
                graph[0].add(new edge(0, 2, 1));


                    graph[1].add(new edge(1, 0, 1));
                    graph[1].add(new edge(1, 3, 1));

                        graph[2].add(new edge(2, 0, 1));

                         graph[2].add(new edge(2, 4, 1));


                             graph[3].add(new edge(3, 1, 1));

                                 graph[3].add(new edge(3, 4, 1));

                                     graph[3].add(new edge(3, 5, 1));


                                         graph[4].add(new edge(4, 2, 1));
    graph[0].add(new edge(4, 3, 1));
    graph[0].add(new edge(4, 5, 1));


        graph[5].add(new edge(5, 3, 1));
    graph[5].add(new edge(5, 4, 1));
    graph[5].add(new edge(5, 6, 1));


    graph[6].add(new edge(5, 5, 1));


        }


//dfs
public static void dfs(ArrayList<edge>[]graph,int curr,boolean visited[]){
    //curr visit
   System.out.println(curr+" ");
   visited[curr]=true;

   //neighbours
    for(int i=0;i<graph[curr].size();i++)
{
    edge e=graph[curr].get(i);
    if(!visited[e.des]){
        dfs(graph, e.des, visited);
    }
}}

//has path
public static boolean haspath(ArrayList<edge>[]graph,int src,int des, boolean visited[]){
    if(src==des){
        return true;

    }
visited[src]=true;
    for(int i=0;i<graph[src].size();i++){
edge e=graph[src].get(i);

//e.des==nieghbours
if(!visited[e.des]&& haspath(graph, e.des, des, visited)){
    return true;
}

    }
    return false;
}



    public static void main(String args[]){
    //int arr[]=new arr[v]
    // ArrayList<edge>[] graph=new ArrayList[v];
    
int v=7;
ArrayList<edge> graph[]=new ArrayList[v];
createGraph(graph);
dfs(graph,0 ,new boolean[v]);
// System.out.println(haspath(graph, 0, 5,new boolean[v]));

    }
}
