package com.fernandocejas.twodaggers;

import javax.inject.Inject;
import javax.inject.Inject2;
import javax.inject.Singleton;
import javax.inject.Singleton2;

@Singleton
@Singleton2
public class StringGenerator {

  @Inject
  @Inject2
  /**
   * This class can be injected by both dagger 1 and 2
   */
  public StringGenerator() {
    //no op
  }

  public String randomValue() {
    //for learning purpose
    return "34290df320e2k0id";
  }
}
