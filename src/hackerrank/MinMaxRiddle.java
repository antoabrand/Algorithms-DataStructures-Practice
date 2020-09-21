package hackerrank;

import java.util.*;

public class MinMaxRiddle {

  public static void main(String[] args) {

    Long[] question = {2L, 6L, 1L, 12L};
    Long[] answer = riddle(question);

    List<Long> list1 = Arrays.asList(answer);

    list1.forEach(x -> System.out.print(x));

  }

  static Long[] riddle(Long[] arr) {
    int window = 1;
    List<Long> list1 = Arrays.asList(arr);
    List<Long> heck = new ArrayList<>();
    Long[] answer = new Long[100000];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < window; j++) {

      }
      window++;
    }

    return answer;
  }

}
