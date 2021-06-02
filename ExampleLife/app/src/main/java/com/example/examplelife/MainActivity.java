package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("APSSDC","First Activity created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","First Activity started");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","First Activity resume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","First Activity paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","First Activity restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","First Activity stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC","First Activity destory");
    }

    public void next(View view) {
        Intent i=new Intent(this,secondactivity.class);
        startActivity(i);
    }
}