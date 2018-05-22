package binary.search.tree;

public class BSTTest {

	public static void main(String[] args) {
		

		Tree<Integer> bst = new BinarySearchTree<>();
		
		bst.add(10);
		bst.add(-1);
		bst.add(0);
		bst.add(-22);
		bst.add(1);
		bst.add(50);
		bst.add(45);
		bst.add(99);
		bst.add(200);
		
		System.out.print("My Tree contains:(In order traversal)  ");
		bst.traversal();
		System.out.println();
		System.out.println("Size:" + bst.getSize());
		System.out.println(); 
		
		bst.remove(50);
		bst.traversal();
		System.out.println();
		System.out.println("Size:" + bst.getSize());
		System.out.println();
		System.out.println();
		System.out.println("Minimum value: " + bst.getMin());
		System.out.println("Maximum value: " + bst.getMax());
		
		
		
	}

}
