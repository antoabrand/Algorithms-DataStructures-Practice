package linkedlists;

public class Node<T extends Comparable<T>> { // extend Comparable to compare nodes to eachother and
                                             // check if
  // if it is a String node, Integer node, etc...

  // data that node holds
  private T data;
  // reference/pointer - which points to the next node in our linkedList
  private Node<T> nextNode;

  // constructor
  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  // useful when checking if you are at the last node - last node wil return null
  public Node<T> getNextNode() {
    return nextNode;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return this.data.toString();
  }
}
