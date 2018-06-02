package randos.isPalindrome;

public class IsPalindrome<T> {

	public  boolean isPalindrome(T item) {
		String[] itemArray = item.toString().split("");
		int index = itemArray.length - 1;
		for (String n : itemArray) {
			if (!n.equals(itemArray[index--])) {
				return false;
			}
		}
		return true;
	}
}
