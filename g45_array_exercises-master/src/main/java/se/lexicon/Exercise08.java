package se.lexicon;

public class Exercise08 {

  /**
   * 8. Write a program which will remove the duplicate elements of a given array [20, 20, 40, 20, 30, 40, 50, 60, 50].
   * Expected output:
   *                Array: 20 20 40 20 30 40 50 60 50
   *                Array without duplicate values: 20 40 30 50 60
   */
  public static void ex8() {
    int[] Numbers = {20, 20, 40, 20, 30, 40, 50, 60, 50, 20, 30, 40 ,50 ,60, 70, 90};
    System.out.println("Array: ");
    removeDuplicate(Numbers);
  }

  private static void removeDuplicate(int[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] == array[j]) {
          array[j] = 0;
        }
      }
      if (array[i] != 0) {
        System.out.println(array[i]);
      }
    }
  }

}
