package ds;

import java.util.LinkedList;
import java.util.List;

class Graph {
    private final int numVertices;
    private final LinkedList<Integer>[] adjacencyList;

    // Constructor
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new LinkedList[numVertices];

        // Initialize adjacency lists for all vertices
        for (int i = 0; i < numVertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge in the graph
    public void addEdge(int source, int destination) {
        // Add an edge from source to destination
        adjacencyList[source].add(destination);
        // If the graph is undirected, add an edge from destination to source as well
        adjacencyList[destination].add(source);
    }

    // Method to print the adjacency list of the graph
    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer vertex : adjacencyList[i]) {
                System.out.print(" -> " + vertex);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        Graph graph = new Graph(5);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the adjacency list representation of the graph
        graph.printGraph();
    }
}

