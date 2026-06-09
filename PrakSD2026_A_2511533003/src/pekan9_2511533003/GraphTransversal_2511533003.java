package pekan9_2511533003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphTransversal_2511533003 {

    private Map<String, List<String>> graph_3003 = new HashMap<>();

    public void addEdge_3003(String node1_3003, String node2_3003) {
        graph_3003.putIfAbsent(node1_3003, new ArrayList<>());
        graph_3003.putIfAbsent(node2_3003, new ArrayList<>());
        graph_3003.get(node1_3003).add(node2_3003);
        graph_3003.get(node2_3003).add(node1_3003);
    }

    public void printGraph_3003() {
        System.out.println("Graph awal (Adjacency List):");
        for (String node_3003 : graph_3003.keySet()) {
            System.out.print(node_3003 + "->");
            List<String> neighbors_3003 = graph_3003.get(node_3003);
            System.out.println(String.join(", ", neighbors_3003));
        }

        System.out.println();
    }

    // DFS recursive
    public void dfs_3003(String start_3003) {
        Set<String> visited_3003 = new HashSet<>();
        System.out.println("Penelususran DFS");
        dfsHelper_3003(start_3003, visited_3003);
        System.out.println();
    }

    private void dfsHelper_3003(String current_3003, Set<String> visited_3003) {
        if (visited_3003.contains(current_3003)) {
            return;
        }
        visited_3003.add(current_3003);
        System.out.print(current_3003 + " ");
        for (String neighbor_3003 : graph_3003.getOrDefault(
            current_3003,
            new ArrayList<>()
        )) {
            dfsHelper_3003(neighbor_3003, visited_3003);
        }
    }

    // BFS
    public void bfs_3003(String start_3003) {
        Set<String> visited_3003 = new HashSet<>();
        Queue<String> queue_3003 = new LinkedList<>();
        queue_3003.add(start_3003);
        visited_3003.add(start_3003);
        System.out.println("Penelusuran BFS:");
        while (!queue_3003.isEmpty()) {
            String current_3003 = queue_3003.poll();
            System.out.print(current_3003 + " ");
            for (String neighbor_3003 : graph_3003.getOrDefault(
                current_3003,
                new ArrayList<>()
            )) {
                if (!visited_3003.contains(neighbor_3003)) {
                    queue_3003.add(neighbor_3003);
                    visited_3003.add(neighbor_3003);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GraphTransversal_2511533003 graph_3003 =
            new GraphTransversal_2511533003();
        graph_3003.addEdge_3003("A", "B");
        graph_3003.addEdge_3003("A", "C");
        graph_3003.addEdge_3003("B", "D");
        graph_3003.addEdge_3003("B", "E");
        System.out.println("Graph Awal Adalah: ");
        graph_3003.printGraph_3003();
        graph_3003.dfs_3003("A");
        graph_3003.bfs_3003("A");
    }
}
