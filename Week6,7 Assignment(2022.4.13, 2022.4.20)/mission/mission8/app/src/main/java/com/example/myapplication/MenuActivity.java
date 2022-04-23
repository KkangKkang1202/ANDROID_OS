package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity
{
    Button clientButton, salesButton, goodsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        setTitle("메뉴 화면");

        this.clientButton = findViewById(R.id.ClientButton);
        this.salesButton = findViewById(R.id.SalesButton);
        this.goodsButton = findViewById(R.id.GoodsButton);

        this.clientButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), ClientActivity.class);
            Toast.makeText(getApplicationContext(), "메뉴로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        this.salesButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), SalesActivity.class);
            Toast.makeText(getApplicationContext(), "메뉴로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        this.goodsButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), GoodsActivity.class);
            Toast.makeText(getApplicationContext(), "메뉴로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });
    }
}
