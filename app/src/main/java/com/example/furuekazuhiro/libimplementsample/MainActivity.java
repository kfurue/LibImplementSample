package com.example.furuekazuhiro.libimplementsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.librarytest.SampleLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new SampleLibrary().sampleMethod();
    }
}
