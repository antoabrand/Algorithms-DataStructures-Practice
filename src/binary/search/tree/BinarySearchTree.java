package binary.search.tree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void traversal() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(T data, Node<T> node) {
		if (this.root == null) {
			this.root = new Node<>(data);
		} else {
			insertNewNode(data, node);
		}
	}

	private void insertNewNode(T data, Node<T> node) {
		if (data.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() != null) // serves as base case for recursive checks
				insertNewNode(data, node.getLeftChild());
			else {
				// meaning we have found the most child and we can append at the end
				Node<T> newNode = new Node<>(data);
				node.setLeftChild(newNode);
			}
		} else {
			// do for the right side now since we know that the new data is large than the
			// root - therefore keeping our tree balances
			if (node.getRightChild() != null) {
				Node<T> newNode = new Node<>(data);
				node.setRightChild(newNode);
			}
		}

	}

	@Override
	public void remove(T data) {
		// TODO Auto-generated method stub

	}

	@Override
	public T getMin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		return null;
	}

}
