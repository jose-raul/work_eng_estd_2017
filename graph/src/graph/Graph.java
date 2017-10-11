package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph<E> {

	private Set<Vertex<E>> vertices = new HashSet<>();

	public Path<E> findShortestPath(Vertex<E> source, Vertex<E> dest) {
		List<Path<E>> allPaths = findAllPaths(source, dest);
		Path<E> result = allPaths.get(0);
		for (Path<E> path : allPaths) {
			if(path.getWeight().compareTo(result.getWeight()) < 0) {
				result = path;
			}
		}
		return result;
	}
	
	public Path<E> findShortestPathLambda(Vertex<E> source, Vertex<E> dest) {
		List<Path<E>> allPaths = findAllPaths(source, dest);

		return allPaths
				.stream()
				.min((a,b) -> a.getWeight().compareTo(b.getWeight()))
				.get();
	}	
	
	public List<Path<E>> findAllPaths(
			Vertex<E> source, 
			Vertex<E> target) {
		
		List<Path<E>> paths = new LinkedList<Path<E>>();
		findPaths(source, target, paths, new Path<E>());
		return paths;
	}

	private void findPaths(
			Vertex<E> current, 
			Vertex<E> target, 
			List<Path<E>> paths,
			Path<E> path) {

		path.getVertices().add(current);
		if (current.equals(target)) {
			paths.add(path.getCopy());
			path.setWeight(0);
			path.getVertices().remove(current);
			return;
		}

		for (Vertex<E>.Edge edge : current.getNeighbors()) {
			path.setWeight(path.getWeight() + edge.getWeight());
			findPaths(edge.getDestination(), target, paths, path);
		}

		path.getVertices().remove(current);

	}	

	public Vertex<E> addVertex(E value) {
		Vertex<E> vertex = new Vertex<>(value);
		vertices.add(vertex);
		return vertex;
	}

	public Set<Vertex<E>> getVertices() {
		return vertices;
	}

}
