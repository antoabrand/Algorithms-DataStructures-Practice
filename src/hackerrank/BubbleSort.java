package hackerrank;

public class BubbleSort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    int[] a = {3, 2, 1};
    countSwaps(a);
  }

  static void countSwaps(int[] a) {

    int countedSwaps = 0;
    int firstElement = 0;
    int lastElement = a.length - 1;

    for (int i = 0; i < a.length; i++) {
      for (int j = a.length - 1; j > i; j--) {
        // compare if first bigger than second
        if (a[i] > a[j]) {
          swap(a, i, j);
          countedSwaps++;
        }
      }
    }

    System.out.printf("Array is sorted in %d swaps. \n", countedSwaps);
    System.out.printf("First Element: %d \n", a[firstElement]);
    System.out.printf("Last Element: %d", a[lastElement]);
  }

  private static void swap(int[] a, int leftElement, int rightElement) {

    int temp = a[rightElement]; // take right/bigger element and store in a temp
    a[rightElement] = a[leftElement]; // take smaller element and replace biggerElement with that
    a[leftElement] = temp;
  }

  public String whoAmI() {
    return "I'm from BubbleSort";
  }

}
