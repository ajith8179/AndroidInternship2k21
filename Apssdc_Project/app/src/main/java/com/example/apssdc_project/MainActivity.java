package com.example.apssdc_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void python(View view) {
        Intent i = new Intent(this,Python.class);
        //i.putExtra("Key",n);
        startActivity(i);

    }

    public void java(View view) {
        Intent i = new Intent(this,java.class);
        //i.putExtra("Key",n);
        startActivity(i);
    }

    public void Cplus(View view) {
        Intent i = new Intent(this,Cplus.class);
        //i.putExtra("Key",n);
        startActivity(i);
    }
}