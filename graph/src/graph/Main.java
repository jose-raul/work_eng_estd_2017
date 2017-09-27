package graph;

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
		zero.addEdge(one);
		zero.addEdge(two);
		zero.addEdge(three);
		zero.addEdge(four);
		two.addEdge(four);
		three.addEdge(four);
	}

}
