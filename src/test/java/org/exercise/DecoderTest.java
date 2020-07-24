package org.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoderTest {

  @Test
  public void shouldCountDecodingWays() {
    assertEquals(Decoder.decode(new char[]{'1', '2', '3', '4', '1', '2', '1'}, 7), 9);
  }


}
