package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

class CookWebViewClient extends WebViewClient
{
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url)
    {
        return (super.shouldOverrideUrlLoading(view, url));
    }
}

public class MainActivity extends AppCompatActivity
{
    EditText editURL;
    Button buttonGo, buttonBack;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단 웹브라우저");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.emo_im_cool);

        this.editURL = findViewById(R.id.editURL);

        this.buttonGo = findViewById(R.id.ButtonGo);
        this.buttonBack = findViewById(R.id.ButtonBack);

        this.webView = findViewById(R.id.WebView1);

        this.webView.setWebViewClient(new CookWebViewClient());

        WebSettings webSettings = this.webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);

        this.buttonGo.setOnClickListener(view -> this.webView.loadUrl(this.editURL.getText().toString()));

        this.buttonBack.setOnClickListener(view -> this.webView.goBack());
    }
}