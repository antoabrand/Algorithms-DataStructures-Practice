package binary.search.tree;

public class BSTTest {

	public static void main(String[] args) {
		

		Tree<Integer> bst = new BinarySearchTree<>();
		
		bst.add(10);
		bst.add(-1);
		bst.add(0);
		bst.add(-22);
		bst.add(1);
		bst.add(1000);
		
		System.out.print("My Tree contains:(In order traversal)  ");
		bst.traversal();
//		System.out.println();
//		System.out.println();
//		System.out.println("Minimum value: " + bst.getMin());
//		System.out.println("Maximum value: " + bst.getMax());
//		
		
	}

}
