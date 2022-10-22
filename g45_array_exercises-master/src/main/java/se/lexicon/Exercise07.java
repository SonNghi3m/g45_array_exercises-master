package se.lexicon;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.print("Array: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    System.out.println();
    System.out.print("Odd Array: ");
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 != 0) {
        System.out.print(numbers[i] + " ");
      }
    }
    System.out.println();
  }

}
