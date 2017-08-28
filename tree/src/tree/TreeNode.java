package tree;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<E> {

	private E value;
	
	private TreeNode<E> parent;
	
	private List<TreeNode<E>> children;

	public TreeNode(E e) {
		value = e;
		children = new LinkedList<>();
	}
	
	public TreeNode<E> addChild(E e) {
		TreeNode<E> child = new TreeNode<>(e);
		child.setParent(this);
		children.add(child);
		return child;
	}
	
	public boolean isRoot() {
		return (parent == null);
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public TreeNode<E> getParent() {
		return parent;
	}

	public void setParent(TreeNode<E> parent) {
		this.parent = parent;
	}

	public List<TreeNode<E>> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode<E>> children) {
		this.children = children;
	}
	
	
	@Override
	public String toString() {
		return value.toString();
	}
}
