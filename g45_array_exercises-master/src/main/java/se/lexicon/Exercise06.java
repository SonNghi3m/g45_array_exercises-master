package se.lexicon;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    int[] numbers = {43, 5, 23, 17, 2, 14};
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
      sum = sum + numbers[i];
    }
    System.out.println("\n");
    System.out.println("The average of the array is: " + (sum/numbers.length));
  }

}
