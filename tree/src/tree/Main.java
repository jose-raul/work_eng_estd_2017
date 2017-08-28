package tree;

public class Main {

	public static void main(String[] args) {
		
		TreeNode<String> root = new TreeNode<>("Raiz");
		root.addChild("F1");
		TreeNode<String> f2 = root.addChild("F2");
		f2.addChild("F3");
		f2.addChild("F4");
		
		for (TreeNode<String> treeNode : root.getChildren()) {
			System.out.println(treeNode);
		}
		
		System.out.println(root);
	}
	
}
