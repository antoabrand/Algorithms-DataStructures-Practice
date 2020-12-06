package datastructures.binarysearchtree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

  private Node<T> root;
  private int size;

  public int getSize() {
    return size;
  }

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
    ++this.size;
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

      } else {
        Node<T> newNode = new Node<>(data);
        node.setRightChild(newNode);
      }
    }

  }

  @Override
  public void remove(T data) {
    --this.size;
    if (root != null) {
      root = delete(data, root);
    }

  }

  private Node<T> delete(T data, Node<T> node) {

    if (node == null)
      return node;

    // search for the data that we want to delete
    if (node.getData().compareTo(data) > 0) { // means we have to traverse the left sub tree
      node.setLeftChild(delete(data, node.getLeftChild())); // recursive call - once we get to where
                                                            // the node ==
      // null we will return null and set the parent's
      // left child to null
    } else if (node.getData().compareTo(data) < 0) { // means we have to traverse the right sub tree
      node.setRightChild(delete(data, node.getRightChild()));
    } else {
      // we have found the data we are searching for the delete
      // now check if we are deleting a leaf vs a node with a right child or a node
      // with a left child

      // 1st scenario - deleting a leaf node
      if (node.getLeftChild() == null && node.getRightChild() == null) { // we have found a leaf
                                                                         // node
        // just return null and set root of wrapper method
        System.out.println("Removing leaf node ...");
        return null;
      }
      // 2nd scenario - deleting a node with a single child
      // no need to check for right child null bc of previous condition
      if (node.getLeftChild() == null) {
        // we found a node with a right child
        Node<T> tempNode = node.getRightChild();
        node = null;
        return tempNode;
      } else if (node.getRightChild() == null) {
        // we found a node with a left child
        Node<T> tempNode = node.getLeftChild();
        node = null;
        return tempNode;
      }
      // 3rd scenario - deleting a root node of a given tree or sub tree - need to
      // swap the predecessor, which is the largest node on the left subtree - then
      // delete the swapped root since it become a leaf node

      Node<T> temp = getPredecessor(node.getLeftChild()); // gets the predeccesor
      node.setData(temp.getData()); // swap the 2 nodes
      node.setLeftChild(delete(temp.getData(), node.getLeftChild())); // remove it as it's a leaf
                                                                      // node

    }
    return node;
  }

  private Node<T> getPredecessor(Node<T> node) {

    if (node.getRightChild() != null)
      return getPredecessor(node.getRightChild());

    return node;
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
