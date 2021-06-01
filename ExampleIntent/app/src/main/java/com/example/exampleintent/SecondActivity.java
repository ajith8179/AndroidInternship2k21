package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //reading data from first activity
        String n= getIntent().getStringExtra("Key");
        //display welcome
        Toast.makeText(this,"Welcome "+n,Toast.LENGTH_SHORT).show();
    }
}