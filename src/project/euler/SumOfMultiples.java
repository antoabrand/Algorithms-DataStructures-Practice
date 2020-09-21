package project.euler;

public class SumOfMultiples {

  public static void main(String[] args) {
    System.out.println(sumOfMultiples());
  }

  public static int sumOfMultiples() {
    int sum = 0;
    for (int i = 0; i < 1000; i++) {
      if (i % 3 == 0) {
        sum += i;
      } else if (i % 5 == 0) {
        sum += i;
      }
    }
    return sum;
  }

}
