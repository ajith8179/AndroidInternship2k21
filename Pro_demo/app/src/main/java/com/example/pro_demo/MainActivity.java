package com.example.pro_demo;

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

    public void next(View view) {

        //String n= name.getText().toString();
        //Intent obj = new Intent (present class ,next class)
        //startactivity(obj)
        Intent i = new Intent(this,MainActivity2.class);
        //i.putExtra("Key",n);
        startActivity(i);
    }

    public void next2(View view) {
        Intent i=new Intent(this,MainActivity3.class);
        startActivity(i);
    }
}