package cci;

public class Stack<T> {

	class StackNode<T> {
		private T data;
		private StackNode<T> next;

		StackNode(T data) {
			this.data = data;
		}
	}

	private StackNode<T> top;

	// peek
	private T peek() {
		if (top == null)
			return null;
		return top.data;
	}

	// pop
	private T pop() {
		if (top == null)
			return null;
		T item = top.data;
		top = top.next;
		return item;
	}

	// push
	private void push(T data) {
		StackNode<T> item = new StackNode<T>(data);
		top.next = top;
		top = item;
	}

	// isempty
	private boolean isEmpty() {
		return top == null;
	}

	// min
	

}
