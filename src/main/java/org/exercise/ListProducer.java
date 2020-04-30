package org.exercise;

public class ListProducer {

  /**
   * Given an array of integers, return a new array such that each element at index i of the new array is the product of
   * all the numbers in the original array except the one at i.
   * <p>
   * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input
   * was [3, 2, 1], the expected output would be [2, 3, 6].
   */
  public static int[] produceArray(int[] initialArray) {
    int sum = initialArray[0];
    int[] resultArray = new int[initialArray.length];

    for (int i = 1; i < initialArray.length; i++) {
      sum = sum * initialArray[i];
    }

    for (int i = 0; i < initialArray.length; i++) {
      resultArray[i] = sum / initialArray[i];
    }

    return resultArray;
  }
}
