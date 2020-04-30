package org.exercise;

public class ListProducer {

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
