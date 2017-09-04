package btree;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		BTree<Integer> btree = new BTree<>(6);

		BTreeNode<Integer> four = btree.getRoot().addLeftChild(4);
		BTreeNode<Integer> seven = btree.getRoot().addRightChild(7);

		four.addLeftChild(3);
		four.addRightChild(5);
		seven.addRightChild(9);

		traverseDFS(btree.getRoot());
		traverseBFS(btree.getRoot());

	}

	public static void traverseBFS(BTreeNode<Integer> node) {
		Queue<BTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			BTreeNode<Integer> temp = queue.poll();
			System.out.println(temp);
			if (temp.getLeftChild() != null) {
				queue.add(temp.getLeftChild());
			}
			if (temp.getRightChild() != null) {
				queue.add(temp.getRightChild());
			}
		}
	}
	
	public static void traverseDFS(BTreeNode<Integer> node) {
		System.out.println(node);
		if (node.getLeftChild() != null) {
			traverseDFS(node.getLeftChild());
		}
		if (node.getRightChild() != null) {
			traverseDFS(node.getRightChild());
		}
	}

}
