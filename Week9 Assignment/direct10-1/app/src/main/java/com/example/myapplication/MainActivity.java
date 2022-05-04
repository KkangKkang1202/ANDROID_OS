package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button openNewActivity;
    RadioButton selectSecondActivity;
    RadioButton selectThirdActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("직접 풀어보기 10-1(2020039048 김강민)");

        this.openNewActivity = findViewById(R.id.OpenNewActivity);
        this.selectSecondActivity = findViewById(R.id.SelectSecondActivity);
        this.selectThirdActivity = findViewById(R.id.SelectThirdActivity);

        this.openNewActivity.setOnClickListener(view ->
        {
            if(!selectSecondActivity.isChecked() && !selectThirdActivity.isChecked())
            {
                Toast.makeText(getApplicationContext(), "액티비티를 선택해주세요.", Toast.LENGTH_SHORT).show();
            }
            else if(selectSecondActivity.isChecked())
            {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
            else if(selectThirdActivity.isChecked())
            {
                Intent intent = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(intent);
            }

        });
    }
}