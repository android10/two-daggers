package com.fernandocejas.twodaggers;

public class Dagger1DataManager {
  private final StringGenerator stringGenerator;

  public Dagger1DataManager(StringGenerator stringGenerator) {
    this.stringGenerator = stringGenerator;
  }

  public String data() {
    return stringGenerator.randomValue();
  }
}
