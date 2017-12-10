package tony.linked.lists;

import java.util.LinkedList;

public class HelloWorld {

  public static void main(String[] args) {
    
    LinkedList<Integer> myLinkedList = new LinkedList<>();
    //.push() will place item in front of list - most efficient
    myLinkedList.push(6);
    System.out.printf(myLinkedList.toString());
    //.add() will have to check for node that contains a reference to a null - meaning it is the last node
    //and then append the item to the list 
    myLinkedList.add(12);
    System.out.printf(myLinkedList.toString());
    // O(1)
    myLinkedList.removeFirst();
    System.out.printf(myLinkedList.toString());
    myLinkedList.add(199);
    System.out.printf(myLinkedList.toString());
    myLinkedList.add(200);
    System.out.printf(myLinkedList.toString());
    Integer num = myLinkedList.pop();
    System.out.printf(num.toString());
   
  }

}
/**
 *  --LinkedLists

    Node - composed of data & reference/link to next/previous node in sequence

    Used to implement stacks, queues

    Requires sequential scanning for locating data within structure - no indices

    ...Pros: dynamic, allocates needed memory in run-time,
        very efficient if we want to manipulate the first Elements,
        stores items with different size
    ...Cons: wastes memory because of references, nodes must be read from the beginning 
        as they have sequential access, items reached in O(1) - linear complexity,
        reverse traversing is difficult - Solution: doubly linked lists -> easier to read, 
        but memory is wasted in allocating space for a back pointer 

    Insertion of items - 
    
    	linkedList.add() - add item to at end of list - not simple, need to traverse whole linked list to find last node
    		find node pointing to null, then update references when we get there
    			O(N) time complexity 
     	linkedList.push() - O(1) - because it will always only have to iterate once at the beginning
     		of the list 
     	linkedList.removeFirst()- removing an item from beginning of list - O(1) 
     	linkedList.remove() - an item from anywhere else - O(N)
**/
