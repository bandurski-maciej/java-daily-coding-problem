package org.exercise;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListAdderTest {

  @Test
  public void testAreElementsAddingToNumber() {
    assertTrue(ListAdder.areElementsAddingToNumber(new int[]{10, 15, 3, 7}, 17));
  }
}
