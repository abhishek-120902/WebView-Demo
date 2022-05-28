package com.abhishek.webviewdemo;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Declaring Variables
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialise();

        //For displaying websites properly
        webView.getSettings().setJavaScriptEnabled(true);

        //To not to jump to device's default browsers
        webView.setWebViewClient(new WebViewClient());

        //To load the url -> "https://www.google.com/"
        webView.loadUrl("https://www.google.com/");

    }

    private void initialise() {
        //Initializing Variables
        webView = findViewById(R.id.webView);
    }
}