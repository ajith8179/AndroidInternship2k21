package com.example.examplelife;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","Second Activity started");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","Second Activity resume");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","Second Activity paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","Second Activity restart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","Second Activity stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC","Second Activity destory");
    }
}