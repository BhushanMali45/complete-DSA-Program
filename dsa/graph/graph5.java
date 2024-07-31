import java.util.*;

public class graph5 {
    static class edge {
        int src;
        int des;
        int wt;

        public edge(int s, int d, int w) {
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
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

    // dfs
    public static void dfs(ArrayList<edge>[] graph) {
        boolean visited[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                dfsutil(graph, i, visited);
            }
        }
    }

    public static void dfsutil(ArrayList<edge>[] graph, int curr, boolean visited[]) {
        // curr visit
        System.out.println(curr + " ");
        visited[curr] = true;

        // neighbours
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!visited[e.des]) {
                dfsutil(graph, e.des, visited);
            }
        }
    }

    // has path

    public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        dfs(graph); // Call dfs method here
    }
}
