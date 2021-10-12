package GreatLearning_Lab3_Question2;

import java.util.ArrayList;
import java.util.Collections;

public class RootPath_Driver {public static class Node {
	int data;
	Node leftnode;
	Node rightnode;

	public Node(int x) {
		data = x;
		leftnode = null;
		rightnode = null;
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	// Creating nodes and root of a tree allocating memory in heap.
		Node root = new Node(100);
		Node node1 = new Node(20);
		Node node2 = new Node(130);
		Node node3 = new Node(10);
		Node node4 = new Node(50);
		Node node5 = new Node(110);
		Node node6 = new Node(140);
		Node node7 = new Node(5);

		// linking all nodes and root together to form Binary tree
		root.leftnode = node1;
		root.rightnode = node2;
		node1.leftnode = node3;
		node1.rightnode = node4;
		node2.leftnode = node5;
		node2.rightnode = node6;
		node3.leftnode = node7;
		

		//Creating object for class LongPath
		RootPath lp = new RootPath();
		
		//calling longest path method
		ArrayList<Integer> output = lp.longestPath(root);
		Collections.sort(output, Collections.reverseOrder());
		

		System.out.print("Longest Path is ==> ");
		for(int i=0; i<output.size(); i++) {
			int element = output.get(i);
			System.out.print(element+"  ");
		}
}

}
