package org.exercise;

public class Decoder {

  public static int decode(char[] message, int len) {
    int i;
    int w;
    int[] ways = {1, 0};

    for (i = 0; i < len; ++i) {
      w = 0;
      if ((i > 0) && ((message[i - 1] == '1') || (message[i - 1] == '2' && message[i] < '7'))) {
        w += ways[1];
      }
      if (message[i] > '0') {
        w += ways[0];
      }
      ways[1] = ways[0];
      ways[0] = w;
    }
    return ways[0];
  }

}
