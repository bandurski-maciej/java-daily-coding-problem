package org.exercise;

public class ListAdder {

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
