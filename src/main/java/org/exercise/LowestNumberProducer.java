package org.exercise;

import java.util.Arrays;

public class LowestNumberProducer {

  /**
   * Given an array of integers, find the first missing positive integer in linear time and constant space.
   * In other words, find the lowest positive integer that does not exist in the array.
   * The array can contain duplicates and negative numbers as well.
   * <p>
   * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
   */
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
