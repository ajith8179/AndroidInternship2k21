package com.example.apssdc_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Cplus extends AppCompatActivity {
    public WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus);
        WebView mywebview=(WebView) findViewById(R.id.webView);
        WebSettings web=mywebview.getSettings();
        web.setJavaScriptEnabled(true);
        mywebview.loadUrl("https://www.geeksforgeeks.org/c-plus-plus/");
        mywebview.setWebViewClient(new WebViewClient());
    }
    public void onBackPressed(){
        if (mywebview.canGoBack())
        {
            mywebview.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}