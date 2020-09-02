package tony.linked.lists;

public interface IList <T> {

	public void insert(T data); 
	public void remove(T data);
	public void traverseList();
	public int size();
	public int find(T data);
	public int height(T data);
}
