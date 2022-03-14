package com.nqhuy.androidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnToFlutter = findViewById(R.id.btnToFlutter);
        btnToFlutter.setOnClickListener(view -> {
            startActivity(
                    FlutterActivity
                            .withNewEngine()
                            .build(this)
            );
        });
    }
}