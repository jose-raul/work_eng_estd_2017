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
		
		bfs(root);
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
