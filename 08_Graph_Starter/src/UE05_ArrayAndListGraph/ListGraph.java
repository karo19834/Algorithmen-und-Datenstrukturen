package UE05_ArrayAndListGraph;

import java.util.ArrayList;
import java.util.List;

public class ListGraph implements Graph {

	private ArrayList<WeightedEdge>[] graph;
	private int numVertices;
	private boolean directed;
	
	public ListGraph(int numVertices, boolean directed) {
		graph = new ArrayList[numVertices];
		for (int i=0; i < numVertices; i++)
			graph[i] = new ArrayList<WeightedEdge>();
		this.numVertices = numVertices;
		this.directed = directed;
	}
	
	public int numVertices() {
		return numVertices;
	}
	
	public boolean isDirected() {
		return directed;
	}

	public boolean hasEdge(int v1, int v2) {
		WeightedEdge weightedEdge = findEdge(v1, v2);
		return weightedEdge != null;
	}

	public int getEdgeWeight(int v1, int v2) {
		WeightedEdge weightedEdge = findEdge(v1, v2);
		return weightedEdge.weight;
	}

	public void addEdge(int v1, int v2) {
		addEdge(v1, v2, 1);
	}
	
	public void addEdge(int v1, int v2, int weight) {
		graph[v1].add(new WeightedEdge(v1, v2, weight));
		if (!directed) {
			graph[v2].add(new WeightedEdge(v2, v1, weight));
		}
	}
	
	private WeightedEdge findEdge(int v1, int v2) {
		for (WeightedEdge weightedEdge: graph[v1]) {
			if (weightedEdge.to_vertex == v2) {
				return weightedEdge;
			}
		}
		return null;
	}

	public void removeEdge(int v1, int v2) {
		graph[v1].remove(findEdge(v1,v2));
		if(!directed) {
			graph[v2].remove(findEdge(v2,v1));
		}
	}

	public List<WeightedEdge> getEdges(int v) {
		return graph[v];
	}
}
