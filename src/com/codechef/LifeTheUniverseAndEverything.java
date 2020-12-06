package com.codechef;

import java.io.IOException;
import java.util.Scanner;

class LifeTheUniverseAndEverything {

  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);

    while (true) {
      long numInput = input.nextLong();

      System.out.println(numInput);

      if (numInput == 42) {
        break;
      }
    }
  }
}

