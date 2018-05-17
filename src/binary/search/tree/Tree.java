package binary.search.tree;

public interface Tree<T>{
	
	public void traversal();

	public void add(T data, Node<T> node);

	public void remove(T data);

	public T getMin();

	public T getMax();
}
