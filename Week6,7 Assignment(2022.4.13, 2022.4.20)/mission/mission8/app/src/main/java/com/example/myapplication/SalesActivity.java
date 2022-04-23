package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SalesActivity extends AppCompatActivity
{
    Button salesMenuButton, salesLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sales);
        setTitle("매출 관리 화면");

        this.salesMenuButton = findViewById(R.id.SalesMenuButton);
        this.salesLoginButton = findViewById(R.id.SalesLoginButton);

        this.salesMenuButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            Toast.makeText(getApplicationContext(), "메출 관리로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        this.salesLoginButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Toast.makeText(getApplicationContext(), "메출 관리로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });
    }
}
