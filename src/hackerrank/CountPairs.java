package hackerrank;

import java.util.*;
import hackerrank.Human;

public class CountPairs {

  public static void main(String[] args) {
    // setup
    int[] socks = {1, 1, 1, 1, 1, 1, 2};
    int numberOfSocks = socks.length;

    Human h1 = Human.getInstance();
    Human h2 = Human.getInstance();
    Human h3 = Human.getInstance();

    h1 = null;

    System.out.println(h1);

    h1 = Human.getInstance();

    System.out.println(h1);

    System.out.println(h2);

    System.out.println(h3);

    System.out.print(getPairs(numberOfSocks, socks));

  }

  private static int getPairs(int n, int[] socks) {
    Map<Integer, Integer> mymap = new HashMap<>();
    int pairs = 0;

    for (int i = 0; i < socks.length; i++) {
      if (mymap.containsKey(socks[i])) {
        mymap.put(socks[i], mymap.get(socks[i]) + 1);
      } else {
        mymap.put(socks[i], 1);
      }
    }

    for (int sock : mymap.keySet()) {
      pairs += mymap.get(sock) / 2;
    }

    return pairs;
  }

}
