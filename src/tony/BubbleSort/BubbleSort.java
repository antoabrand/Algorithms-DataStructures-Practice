package tony.BubbleSort;

import java.util.*;

public class  BubbleSort {

    public static void main(String args[]) {
        int[] someArray = new int[7];
        someArray[0] = 20;
        someArray[1] = 35;
        someArray[2] = -15;
        someArray[3] = 7;
        someArray[4] = 55;
        someArray[5] = 1;
        someArray[6] = -22;

        System.out.println(reverseWords(null));

    }

    //bubbleSort
    public static int[] bubbleSort(int[] array) {

        //compare the left to the right for each element in the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i] + 1) {
                int tempSlot = 0;
                int smallerElement;
                int largerElement;
            }
        }

        return array;
    }

    public static String reverseWords(String string) {

        try {
            List<String> myStringList = Arrays.asList(string.split(" "));
            Collections.reverse(myStringList);

            StringBuilder sb = new StringBuilder();

            for (String s : myStringList) {
                sb.append(s + " ");
            }
            return sb.toString();

        } catch (Exception e) {
            System.out.println(e);
        }

        return "Executed but failed.";
    }

}