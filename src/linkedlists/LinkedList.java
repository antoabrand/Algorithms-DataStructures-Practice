package linkedlists;

public class LinkedList<T extends Comparable<T>> implements IList<T>{
	
	private Node<T> root;
	private int size;

	@Override
	public void insert(T data) {
		++size;
		//if true then we know we are at the beginning of the list so we instantiate the root with new 
		if(root == null) {
			this.root = new Node<T>(data);
		}
		else {
			insertAtBeginning(data);
		}
	}

	//O(1) complexity 
	private void insertAtBeginning(T data) {
		// update the references
		//create the new node
		Node<T> newNode = new Node<T>(data);
		//update the reference of the next node to point to the root 
		newNode.setNextNode(this.root);
		
		this.root = newNode; 
		
	}

	//only use if we need to implement this then fine - otherwise if we are wanting to insert elements at the back
	//of our structure, preferable to use ArrayList if we want dynamic sizing - if we know
	//the size before hand then more efficient to use simple Array
	//O(n) complexity - since we must traverse entire list until we hit end ->getNextNode returns null 
	private void insertAtEnd(T data, Node <T> node) {
		if(node.getNextNode() != null) {
			insertAtEnd( data, node.getNextNode());
		}
		else {
			Node<T> newNode = new Node<T>(data);
			newNode.setNextNode(newNode);
		}
	}
	
	@Override
	public void remove(T data) {
		--size;
		  if(root.getData().compareTo(data) == 0) {
			  this.root = this.root.getNextNode();
		  }
		  else {
			  searchAndRemove(data,root,root.getNextNode());
		  }
	}

	private void searchAndRemove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {
		
		while(actualNode.getNextNode() != null) {
			
			//do our check to see if we found that data we want to remove
			if(actualNode.getData().compareTo(dataToRemove) == 0) {
				previousNode.setNextNode(actualNode);
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		
	
		
	} 

	@Override
	public void traverseList() {
		
		if(this.root == null)return;
		
		Node<T> actualNode = this.root; 
		for(int i = 0; i < this.size(); i++) {
			System.out.print(actualNode.getData() + " -> ");
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public int find(T data) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int height(T data) {
		// TODO Auto-generated method stub
		return 0;
	}

}
