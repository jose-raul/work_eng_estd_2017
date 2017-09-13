package exer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import tree.TreeNode;

public class Q3 {

	public static void main(String[] args) {
		TreeNode<Character> root = new TreeNode<Character>('a');
		root.addChild('b');
		TreeNode<Character> c = root.addChild('c');
		c.addChild('d');
		c.addChild('e');
		c.addChild('f');

		List<String> words = findWords2(root);
		for (String string : words) {
			System.out.println(string);
		}
		
	}
	
	public static List<String> findWords(TreeNode<Character> node) {
		List<String> list = new ArrayList<>();
		
		Queue<TreeNode<Character>> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			TreeNode<Character> processing = queue.poll();
			list.add(processing.makeWord());
			for (TreeNode<Character> treeNode : processing.getChildren()) {
				queue.add(treeNode);
			}
		}
		
		return list;
	}
	
	public static List<String> findWords2(TreeNode<Character> node) {
		List<String> list = new ArrayList<>();
		
		Queue<Item> queue = new LinkedList<>();
		queue.add(new Item(node, ""));
		while (!queue.isEmpty()) {
			Item item = queue.poll();
			TreeNode<Character> processing = item.node;
			String word = item.word + processing.getValue().toString();
			list.add(word);
			for (TreeNode<Character> treeNode : processing.getChildren()) {
				queue.add(new Item(treeNode, word));
			}
		}
		
		return list;
	}


	public static void bfs(TreeNode<Character> node) {
		Queue<TreeNode<Character>> queue = new LinkedList<>();
		queue.add(node);
		while (!queue.isEmpty()) {
			TreeNode<Character> processing = queue.poll();
			System.out.println(processing);
			for (TreeNode<Character> treeNode : processing.getChildren()) {
				queue.add(treeNode);
			}
		}
	}

}

class Item {
	public TreeNode<Character> node;
	public String word;
	
	public Item(TreeNode<Character> node, String word) {
		this.node = node;
		this.word = word;
	}
}
