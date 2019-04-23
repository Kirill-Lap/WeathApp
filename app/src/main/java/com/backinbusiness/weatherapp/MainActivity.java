package com.backinbusiness.weatherapp;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        changeTextColor();
    }

    private void initViews(){
        textView = findViewById(R.id.textView);
    }

    private void changeTextColor(){
        int color = ContextCompat.getColor(getApplicationContext(),R.color.colorPrimaryDark);
        textView.setTextColor(color);
    }
}
