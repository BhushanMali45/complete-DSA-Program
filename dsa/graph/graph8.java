import java.util.*;

public class graph8 {

  static class edge {

    int src;
    int des;

    public edge(int s, int d) {
      this.src = s;
      this.des = d;
    }
  }

  //create graph
  static void creategraph(ArrayList<edge> graph[]) { //true
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    graph[0].add(new edge(0, 2));

    graph[1].add(new edge(1, 0));

    graph[2].add(new edge(2, 3));

    graph[3].add(new edge(3, 0));
  }

  //
  public static boolean iscycle(ArrayList<edge> graph[]) {
    boolean vis[] = new boolean[graph.length];
    boolean stack[] = new boolean[graph.length];

    for (int i = 0; i < graph.length; i++) {
      if (!vis[i]) {
        iscycleutil(graph, i, vis, stack);
        return true;
      }
    }
    return false;
  }

  public static boolean iscycleutil(
    ArrayList<edge> graph[],
    int curr,
    boolean vis[],
    boolean stack[]
  ) {
    //core kaam
    vis[curr] = true;
    stack[curr] = true;

    for (int i = 0; i < graph[curr].size(); i++) {
      edge e = graph[curr].get(i);
      if (stack[e.des]) { //cycle
        return true;
      }
      if (!vis[e.des] && iscycleutil(graph, e.des, vis, stack)) {
        return true;
    }
    }
    stack[curr]=false;
return false;
  
  }

  public static void main(String args[]) {
    int v = 4;
    ArrayList<edge> graph[] = new ArrayList[v];
    creategraph(graph);
    System.out.println(iscycle(graph));
  }
}
