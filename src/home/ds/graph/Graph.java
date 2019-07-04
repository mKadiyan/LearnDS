package home.ds.graph;

import java.util.Stack;

public class Graph {
    int[][] vertices = {
            {0, 1, -1, -1, 1},//A
            {1, 0, 1, 1, 1},//B
            {-1, 1, 0, 1, -1},//C
            {-1, 1, 1, 0, 1},//D
            {1, -1, -1, 0, 1}//E
    };

    void dff(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");
        for (int i = 0; i < vertices[v].length; i++) {
            if (!visited[i] && vertices[v][i] != -1)
                dff(i, visited);
        }
    }

    void bff(int v, boolean visited[]) {
        for (int i = 0; i < vertices[v].length; i++) {
            if (!visited[i] && vertices[v][i] != -1){
                visited[i] = true;
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        boolean[] visited = new boolean[5];
        graph.bff(1, visited);

    }
}
