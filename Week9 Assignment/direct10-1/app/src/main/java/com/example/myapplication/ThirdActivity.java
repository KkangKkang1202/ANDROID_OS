package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;


public class ThirdActivity extends Activity
{
    Button buttonReturnFromThird;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);

        this.buttonReturnFromThird = findViewById(R.id.ButtonReturnFromThird);
        this.buttonReturnFromThird.setOnClickListener(view -> finish());
    }
}
