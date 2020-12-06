package algos.sorting;

public class InsertionSort {

  public static void main(String[] args) {
    int[] intArray = {20, 35, -15, 7, 55, -22};

    // this loop grows the sorted partition
    for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
      int newElement = intArray[firstUnsortedIndex];
      int i;

      // this loop looking for correct position to insert and does the shifting
      for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
        intArray[i] = intArray[i - 1];
      }
      intArray[i] = newElement;
    }

    // display the collection once sorted
    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }
  }
}
