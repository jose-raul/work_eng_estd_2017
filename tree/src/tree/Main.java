package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		TreeNode<String> root = new TreeNode<>("A");
		TreeNode<String> b = root.addChild("B");
		b.addChild("H");
		TreeNode<String> c = root.addChild("C");
		c.addChild("D");
		c.addChild("E");
		TreeNode<String> f = c.addChild("F");
		f.addChild("G");
		
		System.out.println(search(root, "F"));
		System.out.println(search(root, "P"));

		System.out.println(searchLevel(root, "F"));
		System.out.println(searchLevel(root, "P"));
	
	}
	
	public static int searchLevel (TreeNode<String> node, String s) {
		int counter = 1;
		Queue<TreeNode<String>> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			counter++;
			TreeNode<String> processing = queue.poll();
			if (processing.getValue().equals(s)) {
				return counter;
			}
			for (TreeNode<String> treeNode : processing.getChildren()) {
				queue.add(treeNode);
			}
		}
		
		return -1;
	
	}
	
	public static boolean search (TreeNode<String> node, String s) {
		Queue<TreeNode<String>> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			TreeNode<String> processing = queue.poll();
			if (processing.getValue().equals(s)) {
				return true;
			}
			for (TreeNode<String> treeNode : processing.getChildren()) {
				queue.add(treeNode);
			}
		}
		
		return false;
	
	}
	
	public static void bfs(TreeNode<String> node) {
		Queue<TreeNode<String>> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()){
			TreeNode<String> processing = queue.poll();
			System.out.println(processing);
			for (TreeNode<String> treeNode : processing.getChildren()) {
				queue.add(treeNode);
			}
		}
	}
	
	public static void dfs(TreeNode<String> node) {
		System.out.println(node);
		List<TreeNode<String>> children = node.getChildren();
		for (TreeNode<String> treeNode : children) {
			dfs(treeNode);
		}
	}
	
}
