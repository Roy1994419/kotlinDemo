package com.zotost.kotlindemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import com.zotost.kotlindemo.blurry.Blurry;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
          final ImageView fl = findViewById(R.id.iv);


        fl.post(new Runnable() {
            @Override
            public void run() {
                Blurry.with(Main2Activity.this)
                        .radius(25)
                        .sampling(1)
                        .async()
                        .capture(fl)
                        .into(fl);
            }
        });

          findViewById(R.id.bt).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Blurry.with(Main2Activity.this)
                          .radius(25)
                          .sampling(1)
                          .async()
                          .capture(fl)
                          .into(fl);
              }
          });

    }
}
