package org.exercise;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestNumberProducerTest {

  @Test
  public void testFindLowestPositiveNumber() {
    assertEquals(LowestNumberProducer.findLowestPositiveNumber(new int[]{3, 4, -1, 1}), 2);
    assertEquals(LowestNumberProducer.findLowestPositiveNumber(new int[]{1, 2, 0}), 3);
  }
}
