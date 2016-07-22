package com.fernandocejas.twodaggers.di;

import com.fernandocejas.twodaggers.Dagger2DataManager;
import com.fernandocejas.twodaggers.StringGenerator;
import dagger.Module2;
import dagger.Provides2;
import javax.inject.Singleton2;

@Module2
public class Dagger2Module {
  @Provides2 @Singleton2
  Dagger2DataManager provideDagger2DataManager(StringGenerator stringGenerator) {
    return new Dagger2DataManager(stringGenerator);
  }
}
