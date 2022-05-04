package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button buttonDial;
    Button buttonWeb;
    Button buttonGoogle;
    Button buttonSearch;
    Button buttonSms;
    Button buttonPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("암시적 인텐트");

        this.buttonDial = findViewById(R.id.ButtonDial);
        this.buttonWeb = findViewById(R.id.ButtonWeb);
        this.buttonGoogle = findViewById(R.id.ButtonGoogle);
        this.buttonSearch = findViewById(R.id.ButtonSearch);
        this.buttonSms = findViewById(R.id.ButtonSms);
        this.buttonPhoto = findViewById(R.id.ButtonPhoto);

        this.buttonDial.setOnClickListener(view ->
        {
            Uri uri = Uri.parse("tel:01012345678");
            Intent intent = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(intent);
        });

        this.buttonWeb.setOnClickListener(view ->
        {
            Uri uri = Uri.parse("http://m.google.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        this.buttonGoogle.setOnClickListener(view ->
        {
            Uri uri = Uri.parse("https://maps.google.co.kr/maps?q="
                    + 37.559133 + "," + 126.927824);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        this.buttonSearch.setOnClickListener(view ->
        {
            Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY, "안드로이드");
            startActivity(intent);
        });

        this.buttonSms.setOnClickListener(view ->
        {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.putExtra("sms_body", "안녕하세요?");
            intent.setData(Uri.parse("smsto:" + Uri.encode("010-1234-5678")));
            startActivity(intent);
        });

        this.buttonPhoto.setOnClickListener(view ->
        {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        });
    }
}