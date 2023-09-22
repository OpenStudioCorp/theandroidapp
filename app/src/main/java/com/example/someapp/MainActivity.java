package com.example.someapp;

import static com.example.someapp.R.*;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        WebView myWebView = findViewById(id.webView);
        myWebView.loadUrl("https://openstudiocorp.vercel.app");


    }
}