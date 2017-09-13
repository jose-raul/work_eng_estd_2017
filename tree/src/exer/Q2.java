package exer;

import java.util.LinkedList;
import java.util.Queue;

import btree.BTree;
import btree.BTreeNode;

public class Q2 {

	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 8, 9, 0 };
		q1(array);
		
	}

	public static void q1(int[] array) {
		BTree<Integer> btree = new BTree<>(array[0]);
		for (int i = 1; i < array.length; i++) {
			btree.insert(array[i]);
		}
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

}
