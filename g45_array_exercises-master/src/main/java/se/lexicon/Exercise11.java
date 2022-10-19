package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise11 {

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */

// create an empty array to add value from user's input
  static String[] initArray = new String[0];
  public static void ex11() {
  int userInput = getUserInput();
  initArray = addNumberToArray(initArray, userInput);
  addMoreNumber(initArray);
  printArray(initArray);
  reverseArray(initArray,initArray.length);
  }

  // create a method to take input from user
  public static int getUserInput () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number and enter 0 to exit: ");

    int userInput = scanner.nextInt();
    return userInput;
  }
  // create a method to add number to original array
    public static String[] addNumberToArray (String[] originArray, int newNumber) {
      String[] newArray = Arrays.copyOf(originArray, originArray.length + 1);
      newArray[newArray.length - 1] = String.valueOf(newNumber);
      return newArray;
    }

  // create a while-loop method to add more number and
  // store input from user to the empty array until user choose number 0 to stop adding number.
  public static String[] addMoreNumber (String[] arrays) {
    boolean userContinue = true;
    while (userContinue) {
      int userInput = getUserInput();
      initArray = addNumberToArray(initArray, userInput);
      if (userInput == 0) {
        break;
      } else userContinue = true;
    }
    return arrays;
}
  //create a method to print array
    public static String[] printArray(String[] array) {
      System.out.println("Array: ");
      for (int i = 0; i < array.length-1; i++) {
          System.out.println(array[i]);
      }
      return array;
    }
  //Create a method to reverse the array
  public static String[] reverseArray(String[] array, int n) {
    String[] newArray = new String[n];
    int j = n;
    for (int i = 0; i < n; i++) {
      newArray[j-1] = array[i];
      j = j - 1;
    }
    System.out.println("Reverse array: ");
    for (int k = 1; k < n; k++) {
      System.out.println(newArray[k]);
    }
    return array;
  }
}
