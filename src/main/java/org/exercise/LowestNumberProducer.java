package org.exercise;

import java.util.Arrays;

public class LowestNumberProducer {

  public static int findLowestPositiveNumber(int[] array) {
    int[] sortedPositiveNumbers = Arrays.stream(array)
      .distinct()
      .filter(el -> el >= 0)
      .sorted()
      .toArray();

    int lowestNumber = sortedPositiveNumbers[0] + 1, iterator = 1;

    while (iterator < sortedPositiveNumbers.length) {
      if (!(sortedPositiveNumbers[iterator] == lowestNumber)) {
        return lowestNumber;
      }
      lowestNumber++;
      iterator++;
    }

    return lowestNumber;
  }
}
