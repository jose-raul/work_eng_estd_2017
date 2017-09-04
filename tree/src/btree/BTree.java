package btree;

public class BTree<E> {

	private BTreeNode<E> root;

	public BTree(E e) {
		BTreeNode<E> node = new BTreeNode<>(e);
		this.root = node;
	}
	
	public BTreeNode<E> addChild(E e) {
		return null;
	}
	
	public BTreeNode<E> getRoot() {
		return root;
	}

	public void setRoot(BTreeNode<E> root) {
		this.root = root;
	}
	
	
}
