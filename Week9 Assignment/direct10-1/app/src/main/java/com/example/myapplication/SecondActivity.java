package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class SecondActivity extends Activity
{
    Button buttonReturnFromSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        this.buttonReturnFromSecond = findViewById(R.id.ButtonReturnFromSecond);
        this.buttonReturnFromSecond.setOnClickListener(view -> finish());
    }
}
