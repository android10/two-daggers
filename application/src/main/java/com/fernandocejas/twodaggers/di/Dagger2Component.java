package com.fernandocejas.twodaggers.di;

import com.fernandocejas.twodaggers.MainActivity;
import dagger.Component;
import javax.inject.Singleton2;

@Singleton2
@Component(modules = Dagger2Module.class)
public interface Dagger2Component {
  void inject(MainActivity activity);
}
