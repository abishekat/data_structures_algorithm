package org.datastructure.graph;

public class Main {

	public static void main(String[] args) {
		Graph myGraph = new Graph();

		myGraph.addVertex("A");
		myGraph.addVertex("B");
		myGraph.addVertex("C");
		myGraph.addVertex("D");
		myGraph.printGraph();
		myGraph.addEdge("A", "B");
		myGraph.addEdge("A", "C");
		myGraph.addEdge("A", "D");
		myGraph.addEdge("D", "B");
		myGraph.addEdge("C", "D");

		myGraph.printGraph();
		myGraph.removeVertex("D");
//		myGraph.removeEdge("A", "B");
		myGraph.printGraph();
	}

}
