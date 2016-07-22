package com.fernandocejas.twodaggers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringGeneratorTest {

  private StringGenerator stringGenerator;

  @Before
  public void setUp(){
    stringGenerator = new StringGenerator();
  }

  @Test
  public void shouldReturnCorrectData() {
    assertEquals(stringGenerator.randomValue(), "34290df320e2k0id");
  }
}
