package tony.BubbleSort;

public class BubbleSort {

  public static void main(String args[]) {

    int[] intArray = {20, 35, -15, 7, 55, -22};

    for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) { // O(n)
                                                                                                    // -
                                                                                                    // outer
                                                                                                    // loop
                                                                                                    // iterates
                                                                                                    // right
                                                                                                    // to
                                                                                                    // left
                                                                                                    // through
                                                                                                    // array
                                                                                                    // and
                                                                                                    // sets
                                                                                                    // the
                                                                                                    // end
      for (int i = 0; i < lastUnsortedIndex; i++) { // O(n) //inner loop iterates left to right
                                                    // comparing values and swapping
        // O(n) x O(n)
        if (intArray[i] > intArray[i + 1]) {
          swap(intArray, i, i + 1);
        }
      }
    }

    for (int i = 0; i < intArray.length; i++) {
      System.out.println(intArray[i]);
    }


  }

  //stores first element value in a temp variable so as to not lose during swapping 
  public static void swap(int[] array, int index, int index2) {
    if (index == index2) {
      return;
    }

    int temp = array[index];
    array[index] = array[index2];
    array[index2] = temp;
  }

}
