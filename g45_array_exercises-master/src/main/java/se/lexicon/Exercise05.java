package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    String[][] countryAndCity = new String[2][2];
    countryAndCity[0][0] = "France";
    countryAndCity[0][1] = "Paris";
    countryAndCity[1][0] = "Sweden";
    countryAndCity[1][1] = "Stockholm";
    for (int i = 0; i < countryAndCity.length; i++) {

      for (int j = 0; j < countryAndCity[i].length; j++) {
        System.out.print(countryAndCity[i][j] + " ");
      }
      System.out.print("\n");
    }
  }

}
