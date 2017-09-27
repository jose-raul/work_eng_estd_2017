package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph<E> {

	private Set<Vertex<E>> vertices = new HashSet<>();

	public void addVertex(Vertex<E> vertex) {
		vertices.add(vertex);
	}

	public Set<Vertex<E>> getVertices() {
		return vertices;
	}
	
}
