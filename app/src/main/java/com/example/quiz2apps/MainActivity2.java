package com.example.quiz2apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview3 =(TextView)findViewById(R.id.textview3);
        Intent intent =getIntent();
        String newtext=intent.getStringExtra(MainActivity.extra);
        textview3.setText(newtext);
    }
}