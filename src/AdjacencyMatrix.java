import java.util.StringJoiner;

public class AdjacencyMatrix {
	private static int[][] adjacencyMatrix; 
	
	public AdjacencyMatrix(int size) {
		adjacencyMatrix = new int[size][size];
	}
	
	public void addEdge(int source, int destination, int weight) {
		adjacencyMatrix[source][destination] = weight;
	}

	public boolean removeEdge(int source, int destination) {
		if(	source > adjacencyMatrix.length ||
				destination > adjacencyMatrix.length ||
				adjacencyMatrix[source][destination] == 0 ){
			return false;
			}
		
		adjacencyMatrix[source][destination] = 0;
		return true;
	}
	
	public void printGraph() {
		StringJoiner header = new StringJoiner("  ");
		StringJoiner rowJoiner = new StringJoiner(", ");
		StringJoiner concat = new StringJoiner("\n");
		
		header.add(" ");
		for(int row = 0; row < adjacencyMatrix.length; row++) {
			header.add(row + "");
			for(int col = 0; col < adjacencyMatrix[0].length; col++) {
				rowJoiner.add(adjacencyMatrix[row][col] + "");
			}
			concat.add(row + " [" + rowJoiner.toString() + "]");
			rowJoiner = new StringJoiner(", ");
		}
		
		System.out.println(header.toString() + "\n" + concat.toString());
	}
}
