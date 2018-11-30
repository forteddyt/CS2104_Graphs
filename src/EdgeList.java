import java.util.ArrayList;
import java.util.StringJoiner;

public class EdgeList{
	private ArrayList<Edge> edgeList;
	
	public EdgeList() {
		edgeList = new ArrayList<Edge>();
	}
	
	public void addEdge(int source, int destination, int weight) {
		Edge edge = new Edge(source, destination, weight);
		
		edgeList.add(edge);
	}
	
	public boolean removeEdge(int source, int destination, int weight) {
		Edge targetEdge = new Edge(source, destination, weight);
		return edgeList.remove(targetEdge);
	}
	
	// Prints to console what the EdgeList representation looks like
	public void printGraph() {
		StringJoiner j = new StringJoiner(", ");
		for(Edge e : edgeList) {
			j.add(e.toString());
		}
		
		System.out.println(j.toString());
	}
}
