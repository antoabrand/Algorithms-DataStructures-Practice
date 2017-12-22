package tony.linked.lists;

public class Node<T extends Comparable<T>> {

	private T data;
	// reference/pointer - which points to the next node in our linkedList
	private Node<?> nextNode;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public Node<?> getNextNode() {
		return nextNode;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNextNode(Node<?> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return this.data.toString();
	}
}
