package com.fernandocejas.twodaggers;

public class Dagger2DataManager {
  private final StringGenerator stringGenerator;

  public Dagger2DataManager(StringGenerator stringGenerator) {
    this.stringGenerator = stringGenerator;
  }

  public String data() {
    return stringGenerator.randomValue();
  }
}
