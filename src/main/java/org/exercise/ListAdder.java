package org.exercise;

public class ListAdder {


  /**
   * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
   * <p>
   * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
   *
   * @return true when numbers add.
   */
  public static boolean areElementsAddingToNumber(int[] numbersArray, int number) {
    for (int i = 0; i < numbersArray.length; i++) {
      for (int j = 0; j < numbersArray.length; j++) {
        if (j <= i) {
          continue;
        }
        if (numbersArray[i] + numbersArray[j] == number) {
          return true;
        }
      }
    }

    return false;
  }
}
