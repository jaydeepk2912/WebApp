package com.example.webapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebView=(WebView)findViewById(R.id.webView);
        WebSettings webSetting=mywebView.getSettings();
        webSetting.setJavaScriptEnabled(true);
        mywebView.loadUrl("https://myaccount.somaiya.edu/#/login");
        mywebView.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        if(mywebView.canGoBack())
        {
            mywebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }

    }
}
