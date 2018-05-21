package binary.search.tree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void traversal() {
		if (root != null)
			inOrderTraversal(root);

	}

	private void inOrderTraversal(Node<T> node) {
		if (node.getLeftChild() != null)
			inOrderTraversal(node.getLeftChild());
		System.out.print(node + " --> ");

		if (node.getRightChild() != null)
			inOrderTraversal(node.getRightChild());
	}

	@Override
	public void add(T data) {
		if (this.root == null) {
			this.root = new Node<>(data);
		} else {
			insertNewNode(data, root);
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
				insertNewNode(data, node.getRightChild());
				
			}
			else {
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

		if (root == null)
			return null;

		return getMinValue(root);
	}

	private T getMinValue(Node<T> node) {
		if (node.getLeftChild() != null)
			return getMinValue(node.getLeftChild());
		return node.getData();
	}

	@Override
	public T getMax() {
		if (root == null)
			return null;
		return getMaxValue(root);
	}

	private T getMaxValue(Node<T> node) {
		if (node.getRightChild() != null)
			return getMaxValue(node.getRightChild());
		return node.getData();
	}

}
