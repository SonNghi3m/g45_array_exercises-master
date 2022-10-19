package se.lexicon;

import java.util.Arrays;

public class Exercise01 {

  /**
   * 1. Write a program which will store elements in an array of type ‘int’ and
   * print it out.
   * Expected output: 11 23 39 etc.
   */
  public static void ex1() {

      int[] ex1Array = {11, 23, 39};
      for (int i = 0; i < ex1Array.length; i++) {
        System.out.print(ex1Array[i] +" ");
      }
      System.out.println("\n");
  }
}
