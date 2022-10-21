package se.lexicon;

public class Exercise12 {

  /**
   * 12.Write a program which will print the diagonal elements of two dimensional array.
   * Expected output: 1 4 9
   */
  public static void ex12() {
    int[][] array = new int[3][3];
    array[0][0] = 1;
    array[0][1] = 2;
    array[0][2] = 3;
    array[1][0] = 2;
    array[1][1] = 4;
    array[1][2] = 6;
    array[2][0] = 3;
    array[2][1] = 6;
    array[2][2] = 9;
    printArray(array);
    System.out.println("------------------------------------");
    int[] diagonalArray = new int[array.length];
    System.out.println("Diagonal array: ");
    for (int k = 0; k < diagonalArray.length; k++) {
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
          if (i == j && i == k) {
            diagonalArray[k] = array[i][j];
            System.out.print(diagonalArray[k] + " ");
          }
        }
      }

    }
    System.out.println(" ");

  }
  public static int[][] printArray (int[][] array) {

    for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
      System.out.print(" " + array[i][j] + "\t");
    }
    System.out.println(" ");
  }
    return array;
  }
}
