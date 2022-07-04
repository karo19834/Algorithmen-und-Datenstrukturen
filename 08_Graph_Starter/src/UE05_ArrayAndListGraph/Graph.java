package UE05_ArrayAndListGraph;

import java.util.List;


public interface Graph {

	public int numVertices();
	public boolean isDirected();
	public boolean hasEdge(int v1, int v2);
	public int getEdgeWeight(int v1, int v2);
	public void addEdge(int v1, int v2);
	public void addEdge(int v1, int v2, int weight);
	public void removeEdge(int v1, int v2);
	public List<WeightedEdge> getEdges(int v);
}
