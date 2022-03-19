package com.example.project2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon);

        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "2020039048 김강민"
        , Toast.LENGTH_SHORT).show());
    }
}