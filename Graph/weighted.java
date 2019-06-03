 class GraphAjdacencyMatrix {
    int vertex;
    int matrix[][];

    public GraphAjdacencyMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int source, int destination , int weighted) {
        //add edge
        matrix[source][destination]= weighted;

        //add bak edge for undirected graph
        matrix[destination][source] = weighted;
    }

    public void printGraph() {
        System.out.println("Graph: (Adjacency Matrix)");
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j <vertex ; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
	}
    

    public static void main(String[] args) {
        GraphAjdacencyMatrix graph = new GraphAjdacencyMatrix(5);
        graph.addEdge(0, 1 ,4);
        graph.addEdge(0, 4 ,3);
        graph.addEdge(1, 2, 4);
        graph.addEdge(1, 3, 3);
        graph.addEdge(1, 4, 6);
        graph.addEdge(2, 3, 3);
        graph.addEdge(3, 4, 6);
        graph.printGraph();
    }
}