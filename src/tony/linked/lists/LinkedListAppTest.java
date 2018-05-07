package tony.linked.lists;

public class LinkedListAppTest {

	public static void main(String[] args) {
	
		LinkedList<Integer> myLinkedList2 = new LinkedList<>();
		
		myLinkedList2.insert(1);
		
		myLinkedList2.insert(100);
		
		myLinkedList2.traverseList();
		
		System.out.println("-------------------");
		myLinkedList2.remove(1);
		
		myLinkedList2.traverseList();

	}

}
