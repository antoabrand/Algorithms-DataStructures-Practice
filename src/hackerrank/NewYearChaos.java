package hackerrank;

import java.util.*;

public class NewYearChaos {

  public static void main(String[] args) {
    // 1, 2, 3, 4, 5, 6, 7, 8
    int[] peopleInLine = {1, 2, 5, 3, 7, 8, 6, 4};
    minimumBribes(peopleInLine);
  }

  static void minimumBribes(int[] q) {
    int minBribes = 0;
    int jumps = 0;

    for (int i = 0; i < q.length; i++) {
      if (q[i] - (i + 1) > 2) {
        System.out.print("Too Chaotic");
        return;
      } else {
        jumps = (q[i] - (i + 1));
        if (jumps > 0)
          minBribes += Math.abs(jumps);
      }
    }
    System.out.println(minBribes);
  }
}
