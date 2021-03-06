package datastructures.binarysearchtree;

public class Node<T> {

  private T data;
  private Node<T> leftChild, rightChild;

  public Node(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public Node<T> getLeftChild() {
    return leftChild;
  }

  public Node<T> getRightChild() {
    return rightChild;
  }

  public void setData(T data) {
    this.data = data;
  }

  public void setLeftChild(Node<T> leftChild) {
    this.leftChild = leftChild;
  }

  public void setRightChild(Node<T> rightChild) {
    this.rightChild = rightChild;
  }

  @Override
  public String toString() {
    return this.data.toString();
  }

}
