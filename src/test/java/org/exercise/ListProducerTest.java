package org.exercise;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ListProducerTest {

  @Test
  public void testProduceArray() {
    assertThat(ListProducer.produceArray(new int[]{1, 2, 3, 4, 5})).containsSequence(120, 60, 40, 30, 24);
    assertThat(ListProducer.produceArray(new int[]{3, 2, 1})).containsSequence(2, 3, 6);
  }
}
