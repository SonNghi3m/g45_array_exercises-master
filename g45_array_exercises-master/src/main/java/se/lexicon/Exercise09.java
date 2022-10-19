package se.lexicon;

import java.util.Scanner;

public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size so you need to come up with a
   * solution to “expand” the array
   */

   public static String[] addElements (String[] elements) {
try {
    //method to add new element to current array
    String[] arrays  = new String[elements.length + 1];
    Scanner scanner = new Scanner(System.in);
    boolean moreElement = true;
    while (moreElement) {
      System.out.println("Enter element you want to add: ");
      String userInput = scanner.next();
      System.out.println("The new array is: ");
      for (int i = 0; i < elements.length; i++) {
        arrays[i] = elements[i];
        System.out.print(arrays[i] + " ");
      }
      arrays[elements.length] = userInput;
      System.out.print(arrays[elements.length] + " ");
      System.out.println("\n");
      System.out.println("-------------------------------------");
      System.out.println("Do you want to add more element? (y/n)");
      char addElement = scanner.next().charAt(0);
      if (addElement == 'n') {
        break;
      } else if (addElement == 'y') {
        addElements(arrays);
      }
    }
    return arrays;
} catch (Exception e) {
  System.out.println("Your input was incorrect!");
}
     return elements;
   }
  public static String[] printArray (String[] arrays) {
    System.out.println("The current array is: ");
    for (int i = 0; i< arrays.length; i++) {
      System.out.print(arrays[i] + " ");
    }
    System.out.println("\n");
    return arrays;
  }
  public static void ex9() {
    String[] initArrays = {"Son", "Nghiem"};
    printArray(initArrays);
    addElements(initArrays);

  }
}

