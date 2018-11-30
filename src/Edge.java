// Source: https://algorithms.tutorialhorizon.com/weighted-graph-implementation-java/

public class Edge {
	int source;
	int destination;
	int weight;

	public Edge(int source, int destination, int weight) {
		this.source = source;
		this.destination = destination;
		this.weight = weight;
	}

	@Override
	public boolean equals(Object o) {
		if(o == null || !(o.getClass() != Edge.class)) { return false; }
		Edge otherEdge = (Edge)o;
		
		return	otherEdge.source == this.source &&
				otherEdge.destination == this.destination &&
				otherEdge.weight == this.weight;
	}
	
	@Override
	public String toString() {
		return "[" + source + " -> " + destination + ", " + weight + "]";
	}
}
