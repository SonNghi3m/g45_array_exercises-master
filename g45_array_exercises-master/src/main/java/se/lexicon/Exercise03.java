package se.lexicon;

import java.util.Arrays;

public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
    String cities[] = {"Paris", "London", "NewYork", "Stockholm"};
    printArray(cities);
    Arrays.sort(cities, String.CASE_INSENSITIVE_ORDER);
    printArray(cities);


  }
  public static String[] printArray (String[] array) {
    for (String arr: array) {
      System.out.print(arr + " ");
    }
    System.out.println("");
    return array;
  }
 }
