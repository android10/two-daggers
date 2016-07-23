package com.fernandocejas.twodaggers;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.fernandocejas.twodaggers.di.Dagger1Module;
import com.fernandocejas.twodaggers.di.Dagger2Component;
import com.fernandocejas.twodaggers.di.Dagger2Module;
import com.fernandocejas.twodaggers.di.DaggerDagger2Component;
import dagger.ObjectGraph;
import javax.inject.Inject;
import javax.inject.Inject2;

public class MainActivity extends Activity {

  @Bind(R.id.txt_dagger1) TextView txt_dagger1;
  @Bind(R.id.txt_dagger2) TextView txt_dagger2;

  @Inject Dagger1DataManager dagger1DataManager;
  @Inject2 Dagger2DataManager dagger2DataManager;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initialize();
  }

  private void initialize() {
    //Dagger 1
    final ObjectGraph objectGraph = ObjectGraph.create(new Dagger1Module());
    objectGraph.inject(this);

    //Dagger 2
    final Dagger2Component dagger2Component = DaggerDagger2Component.builder()
        .dagger2Module(new Dagger2Module())
        .build();
    dagger2Component.inject(this);

    ButterKnife.bind(this);
  }

  @SuppressLint("SetTextI18n")
  @OnClick(R.id.btn_printMessage) void onPrintMessageClick() {
    txt_dagger1.setText("Class injected with Dagger 1: " + dagger1DataManager.data());
    txt_dagger2.setText("Class injected with Dagger 2: " + dagger2DataManager.data());
  }
}
