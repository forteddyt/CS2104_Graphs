import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringJoiner;

public class AdjacencyList {
	private LinkedList<Edge>[] adjacencyList;
	
	public AdjacencyList(int size) {
		adjacencyList = new LinkedList[size];
		for(int i = 0; i < size; i++) {
			adjacencyList[i] = new LinkedList<Edge>();
		}
	}
	
	public void addEdge(int source, int destination, int weight) {
		Edge edge = new Edge(source, destination, weight);
		LinkedList<Edge> sourceNode = adjacencyList[source];
		
		sourceNode.addFirst(edge); // Add to beginning of LinkedList for O(1) insertion time
	}
	
	public boolean removeEdge(int source, int destination, int weight) {
		Edge targetEdge = new Edge(source, destination, weight);
		LinkedList<Edge> nodeList = adjacencyList[source];
		
		return nodeList.remove(targetEdge);
	}

	public void printGraph() {
		StringJoiner nodeJ = new StringJoiner(", ");
		StringJoiner concat = new StringJoiner("\n");
		
		for(int i = 0; i < adjacencyList.length; i++) {
			LinkedList<Edge> nodes = adjacencyList[i];
			for(Edge e : nodes) {
				nodeJ.add(e.toString());
			}
			concat.add("[" + i + "]: " + nodeJ.toString());
			nodeJ = new StringJoiner(", "); // empty nodeJ
		}
		
		System.out.println(concat.toString());
	}
}
