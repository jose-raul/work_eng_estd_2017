package graph;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import graph.Vertex.Edge;

public class Main {

	public static void main(String[] args) {
		Graph<Integer> graph = new Graph<>();
		Vertex<Integer> zero = new Vertex<>(0);
		Vertex<Integer> one = new Vertex<>(1);
		Vertex<Integer> two = new Vertex<>(2);
		Vertex<Integer> three = new Vertex<>(3);
		Vertex<Integer> four = new Vertex<>(4);

		graph.addVertex(zero);
		graph.addVertex(one);
		graph.addVertex(two);
		graph.addVertex(three);
		graph.addVertex(four);
		
		zero.addEdge(one);
		zero.addEdge(three);
		zero.addEdge(four);
		one.addEdge(two);
		two.addEdge(three);
		four.addEdge(three);

		System.out.println(findAllPaths(four, three));

	}

	public static List<Set<Vertex<Integer>>> findAllPaths(Vertex<Integer> source, Vertex<Integer> target) {
		List<Set<Vertex<Integer>>> paths = new LinkedList<Set<Vertex<Integer>>>();
		findPaths(source, target, paths, new LinkedHashSet<Vertex<Integer>>());
		return paths;
	}

	private static void findPaths(Vertex<Integer> current, 
			Vertex<Integer> target, 
			List<Set<Vertex<Integer>>> paths,
			Set<Vertex<Integer>> path) {

		path.add(current);

		if (current.equals(target)) {
			paths.add(new LinkedHashSet<Vertex<Integer>>(path));
			path.remove(current);
			return;
		}

		for (Vertex<Integer>.Edge edge : current.getNeighbors()) {
			findPaths(edge.getDestination(), target, paths, path);
		}

		path.remove(current);

	}

	public static boolean hasPath(Vertex<Integer> source, Vertex<Integer> destination) {
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
			for (Edge edge : neighbors) {
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
			for (Edge edge : neighbors) {
				Vertex<Integer> neighbor = edge.getDestination();
				if (!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor);
				}
			}
		}
	}
}
