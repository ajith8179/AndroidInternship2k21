package com.example.exampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Declare all the views here
    EditText name,number,link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Innitialise all views
        name = findViewById(R.id.name);
        number = findViewById(R.id.number);
        link = findViewById(R.id.link);


    }

    public void next(View view) {
        // workinng with explict names
        String n= name.getText().toString();
        //Intent obj = new Intent (present class ,next class)
        //startactivity(obj)
        Intent i = new Intent(this,SecondActivity.class);
        i.putExtra("Key",n);
        startActivity(i);
    }

    public void dail(View view) {
        //here implict intent
        String n = number.getText().toString();
        //uri - resource identifier
        //phone-tel web -https  ,loc=geo:lat,lon
        Uri uri=Uri.parse("tel:"+n);
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);

    }

    public void search(View view) {
        String n=link.getText().toString();
        Uri uri=Uri.parse("https://"+n);
        Intent i= new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}