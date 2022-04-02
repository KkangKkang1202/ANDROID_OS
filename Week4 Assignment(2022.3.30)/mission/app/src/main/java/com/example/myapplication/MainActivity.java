package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    ImageButton imageButton, imageButton2;
    ScrollView scrollView, scrollView2;
    ImageView imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이미지 번갈아 보여주기");

        this.imageButton = findViewById(R.id.imageButton);
        this.imageButton2 = findViewById(R.id.imageButton2);

        this.scrollView = findViewById(R.id.ScrollView);
        this.scrollView2 = findViewById(R.id.ScrollView2);

        this.imageView = findViewById(R.id.ImageView);
        this.imageView2 = findViewById(R.id.ImageView2);

        this.imageView.setImageResource(R.drawable.dubu);
        this.imageView2.setImageResource(R.drawable.dubu);

        this.scrollView.setVisibility(View.VISIBLE);
        this.scrollView2.setVisibility(View.INVISIBLE);

        this.imageButton.setOnClickListener(view ->
        {
            scrollView.setVisibility(View.VISIBLE);
            scrollView2.setVisibility(View.INVISIBLE);

        });

        this.imageButton2.setOnClickListener(view ->
        {
            scrollView.setVisibility(View.INVISIBLE);
            scrollView2.setVisibility(View.VISIBLE);

        });
    }
}