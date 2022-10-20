package se.lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise13 {

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */

  public static void ex13() {
    //inits 2 arrays with the size from user input
    int arraySize = userInput();
    int[] oddArray = new int[arraySize];
    randomArray(oddArray);
    int[] evenArray = Arrays.copyOf(oddArray, oddArray.length);

    // seperate odd and even numbers and print out 2 arrays.
    System.out.println("Odd array:");
    for (int i = 0; i < oddArray.length; i++) {
      if (oddArray[i] % 2 ==0) {
        oddArray[i] = 0;
      }
      if (oddArray[i] !=0) {
        System.out.println(oddArray[i]);
      }
    }
    System.out.println("----------------------------------");
    System.out.println("Even array:");
    for (int j = 0; j < evenArray.length; j++) {
      if (evenArray[j] % 2 != 0) {
        evenArray[j] = 0;
      }
      if (evenArray[j] !=0) {
        System.out.println(evenArray[j]);
      }
    }
  }

  //take input from user
  public static int userInput () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter size of two arrays: ");
    int arraySize = scanner.nextInt();
    return arraySize;
  }

  //Fill one array with random numbers
  public static int[] randomArray (int[] randomNumber) {
    Random random = new Random();
    for (int i = 0; i < randomNumber.length; i++) {
      randomNumber[i] = random.nextInt();
    }
    return randomNumber;
  }



}
