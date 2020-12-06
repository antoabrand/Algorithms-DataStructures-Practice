package com.project.euler;

public class SumEvenFib {

  public static void main(String[] args) {

    System.out.println(sumEvenFib(4000000L));

  }

  public static Long sumEvenFib(Long number) {

    Long sumOfEvenFibs = 0L;
    int fibo1 = 1;
    int fibo2 = 1;
    int fibonacci = 1;

    if (number == 1 || number == 2) {
      return 1L;
    }

    // starts off at 3 because we will already have the first 0,1,2 of the sequence
    for (int i = 3; i <= number + 1; i++) {

      if (fibonacci < 4000000L) {

        fibonacci = fibo1 + fibo2;
        // checking if fibonacci result is even and if even keep a running sumation
        if (fibonacci % 2 == 0) {
          sumOfEvenFibs += fibonacci;
        }

        fibo1 = fibo2;
        // fibo2 becomes the result so we can keep adding the previous two
        fibo2 = fibonacci;
      } else
        return sumOfEvenFibs;

    }
    return sumOfEvenFibs;
  }

}
