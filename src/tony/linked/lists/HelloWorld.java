package tony.linked.lists;

import java.util.LinkedList;
import java.util.*;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkedList<Integer> myLinkedList = new LinkedList<>();

		int keepGoing = 1;
		System.out.println("Press zero to stop");

		while (keepGoing > 0)
			try {
				System.out.println("Give a method name, e.g., add,push,pop,removeFirst,remove");
				String methodName = input.next();
					if(methodName == "0") {break;}
				System.out.println("Give a number");
				Integer num = (Integer) input.nextInt();
					if(num == 0) {break;}
				changeNPrint(methodName, myLinkedList, num);
				System.out.println();
				System.out.println("-------------------------------------------------------------");
			} catch(NullPointerException | InputMismatchException e) {
				System.out.println("Your input is wrong. Fix it!");
			}
		
		System.out.println("All Done!");

	}

	/**
	 * takes a linkedListMethodCall, alters the list and prints it out
	 * 
	 **/
	private static void changeNPrint(String methodName, LinkedList<Integer> myLinkedList, Integer num) {

		switch (methodName.toLowerCase()) {

		// .add() will have to check for node that contains a reference to a null -
		// meaning it is the last node
		// and then append the item to the list
		case "add": // O(N)
			myLinkedList.add(num);
			System.out.printf("Your list is now: " + myLinkedList.toString());
			break;
		// .push() will place item in front of list - most efficient
		case "push": // O(1)
			myLinkedList.push(num);
			System.out.printf("Your list is now: " + myLinkedList.toString());
			break;
		case "pop": // O(1)
			Integer poppedNum = myLinkedList.pop();
			System.out.printf("Your poppedNumber is now: " + poppedNum.toString());
			break;
		case "remove":
			myLinkedList.remove(num); // O(N)
			System.out.printf("Your list is now: " + myLinkedList.toString());
			break;
		case "removeFirst": // O(1)
			myLinkedList.removeFirst();
			System.out.printf("Your list is now: " + myLinkedList.toString());
			break;
		default:
			System.out.println("You have to put a method name or this isn't going to work. :(");
			break;
		}

	}

}
/**
 * --LinkedLists
 * 
 * Node - composed of data & reference/link to next/previous node in sequence
 * 
 * Used to implement stacks, queues
 * 
 * Requires sequential scanning for locating data within structure - no indices
 * 
 * ...Pros: dynamic, allocates needed memory in run-time, very efficient if we
 *		 want to manipulate the first Elements, stores items with different size
 * ...Cons: wastes memory because of references, nodes must be read from the
 * 		beginning as they have sequential access, items reached in O(1) - linear
 * 		complexity, reverse traversing is difficult - Solution: doubly linked lists
 * 		-> easier to read, but memory is wasted in allocating space for a back
 * 		pointer
 * 
 * Insertion/Removal of items -
 * 
 * linkedList.add() - add item to at end of list - not simple, need to traverse
 * 		whole linked list to find last node find node pointing to null, then update
 * 		references when we get there O(N) time complexity 
 * linkedList.push() - O(1) - because it will always only have to iterate once at the beginning of the list
 * linkedList.removeFirst()- removing an item from beginning of list - O(1)
 * linkedList.remove() - an item from anywhere else - O(N)
 *
 *
 * 
 * Problems with LinkedLists - we can traverse forward but not backward due to
 * references pointing to next node Solution - doubly linkedLists -> Node class
 * has 2 references - one to next node/ one to previous con - heavy on memory -
 * storing all the extra references - however, no need to track previous node
 * during traversal
 **/
