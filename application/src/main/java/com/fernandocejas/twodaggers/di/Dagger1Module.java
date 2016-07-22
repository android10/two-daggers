package com.fernandocejas.twodaggers.di;

import com.fernandocejas.twodaggers.Dagger1DataManager;
import com.fernandocejas.twodaggers.MainActivity;
import com.fernandocejas.twodaggers.StringGenerator;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module(injects = MainActivity.class)
public class Dagger1Module {
  @Provides @Singleton
  Dagger1DataManager provideDagger1DataManager(StringGenerator stringGenerator) {
    return new Dagger1DataManager(stringGenerator);
  }
}
