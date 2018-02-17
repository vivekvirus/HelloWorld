package com.fetchgiant.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Hello there",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"hi vivek",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(),"Hello there",Toast.LENGTH_LONG).show();

    }
}
