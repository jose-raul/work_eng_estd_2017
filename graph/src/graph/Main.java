package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<>();
		Vertex<Integer> zero = graph.addVertex(0);
		Vertex<Integer> one = graph.addVertex(1);
		Vertex<Integer> two = graph.addVertex(2);
		Vertex<Integer> three = graph.addVertex(3);
		Vertex<Integer> four = graph.addVertex(4);

		zero.addEdge(one, 20);
		zero.addEdge(three, 70);
		zero.addEdge(four, 40);
		one.addEdge(two, 15);
		two.addEdge(three, 30);
		four.addEdge(three, 35);
		
		System.out.println(graph.findShortestPath(zero, three));
		System.out.println(graph.findShortestPathLambda(zero, three));
		
/*		System.out.println(findAllPaths(zero, three));
		System.out.println(findShortestPathLambda(zero, three));
		System.out.println(findShortestPath(zero, three));*/

	}

	public static Path_bak<Integer> findShortestPathLambda(
			Vertex<Integer> source, 
			Vertex<Integer> target) {
		
		List<Path_bak<Integer>> paths = new LinkedList<Path_bak<Integer>>();
		findPaths(source, target, paths, new Path_bak<Integer>());
		return paths.stream().min((a, b) -> a.compareTo(b)).get();
	}

	public static Path_bak<Integer> findShortestPath(
			Vertex<Integer> source, 
			Vertex<Integer> target) {
		
		List<Path_bak<Integer>> paths = new LinkedList<Path_bak<Integer>>();
		findPaths(source, target, paths, new Path_bak<Integer>());
		Path_bak<Integer> result = paths.get(0);
		
		for (Path_bak<Integer> path : paths) {
			if (path.getWeight().compareTo(result.getWeight()) < 0) {
				result = path;
			}
		}
		
		return result;
	}

	public static List<Path_bak<Integer>> findAllPaths(
			Vertex<Integer> source, 
			Vertex<Integer> target) {
		
		List<Path_bak<Integer>> paths = new LinkedList<Path_bak<Integer>>();
		findPaths(source, target, paths, new Path_bak<Integer>());
		return paths;
	}

	private static void findPaths(
			Vertex<Integer> current, 
			Vertex<Integer> target, 
			List<Path_bak<Integer>> paths,
			Path_bak<Integer> path) {

		path.getVertices().add(current);

		if (current.equals(target)) {
			paths.add(path.copy());
			path.getVertices().remove(current);
			path.setWeight(0);
			return;
		}

		for (Vertex<Integer>.Edge edge : current.getNeighbors()) {
			path.setWeight(path.getWeight() + edge.getWeight());
			findPaths(edge.getDestination(), target, paths, path);
		}

		path.getVertices().remove(current);
	}

	public static boolean hasPath(
			Vertex<Integer> source, 
			Vertex<Integer> destination) {

		Set<Vertex<Integer>> visited = new HashSet<>();
		Queue<Vertex<Integer>> queue = new LinkedList<>();
		queue.add(source);
		visited.add(source);

		while (!queue.isEmpty()) {
			Vertex<Integer> vertex = queue.poll();
			if (vertex.equals(destination)) {
				return true;
			}
			Set<Vertex<Integer>.Edge> neighbors = vertex.getNeighbors();
			for (Vertex<Integer>.Edge edge : neighbors) {
				Vertex<Integer> neighbor = edge.getDestination();
				if (!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor);
				}
			}
		}
		return false;
	}

	public static void traverse(Vertex<Integer> source) {
		Set<Vertex<Integer>> visited = new HashSet<>();
		Queue<Vertex<Integer>> queue = new LinkedList<>();
		queue.add(source);
		visited.add(source);

		while (!queue.isEmpty()) {
			Vertex<Integer> vertex = queue.poll();
			System.out.println(vertex.getValue());
			Set<Vertex<Integer>.Edge> neighbors = vertex.getNeighbors();
			for (Vertex<Integer>.Edge edge : neighbors) {
				Vertex<Integer> neighbor = edge.getDestination();
				if (!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor);
				}
			}
		}
	}
}
