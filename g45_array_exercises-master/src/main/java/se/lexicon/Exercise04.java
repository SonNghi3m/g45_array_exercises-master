package se.lexicon;

import java.util.Arrays;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {
    int[] array1 = {1, 15, 20};
    int[] array2 = Arrays.copyOf(array1, array1.length);
    System.out.print("Elements from first array: ");
    for (int num: array1) {
      System.out.print(num + " ");
    }
    System.out.println(" ");
    System.out.print("Elements from second array: ");
    for (int num: array2) {
      System.out.print(num + " ");
    }
    System.out.println(" ");
  }

}
