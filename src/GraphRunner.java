
public class GraphRunner {
	private static EdgeList edgeList;
	private static AdjacencyList adjacencyList;
	private static AdjacencyMatrix adjacencyMatrix;
	
	public static void main(String[] args) {
		System.out.println("\nEdgeList Representation:\n");
		edgeList = new EdgeList();
		edgeList.addEdge(0, 1, 2);
		edgeList.addEdge(0, 2, 6);
		edgeList.addEdge(0, 3, 7);
		edgeList.addEdge(1, 3, 3);
		edgeList.addEdge(1, 4, 6);
		edgeList.addEdge(2, 4, 1);
		edgeList.addEdge(3, 4, 5);
		edgeList.printGraph();

		System.out.println("\nAdjacencyMatrix Representation:\n");
		adjacencyMatrix = new AdjacencyMatrix(5);
		adjacencyMatrix.addEdge(0, 1, 2);
		adjacencyMatrix.addEdge(0, 2, 6);
		adjacencyMatrix.addEdge(0, 3, 7);
		adjacencyMatrix.addEdge(1, 3, 3);
		adjacencyMatrix.addEdge(1, 4, 6);
		adjacencyMatrix.addEdge(2, 4, 1);
		adjacencyMatrix.addEdge(3, 4, 5);
		adjacencyMatrix.printGraph();

		System.out.println("\nAdjacencyList Representation:\n");
		adjacencyList = new AdjacencyList(5);
		adjacencyList.addEdge(0, 1, 2);
		adjacencyList.addEdge(0, 2, 6);
		adjacencyList.addEdge(0, 3, 7);
		adjacencyList.addEdge(1, 3, 3);
		adjacencyList.addEdge(1, 4, 6);
		adjacencyList.addEdge(2, 4, 1);
		adjacencyList.addEdge(3, 4, 5);
		adjacencyList.printGraph();
	}
	
}
