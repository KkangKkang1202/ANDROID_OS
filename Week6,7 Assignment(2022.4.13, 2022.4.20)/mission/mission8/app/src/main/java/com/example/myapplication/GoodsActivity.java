package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class GoodsActivity extends AppCompatActivity
{
    Button goodsMenuButton, goodsLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goods);
        setTitle("상품 관리 화면");

        this.goodsMenuButton = findViewById(R.id.GoodsMenuButton);
        this.goodsLoginButton = findViewById(R.id.GoodsLoginButton);

        this.goodsMenuButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            Toast.makeText(getApplicationContext(), "상품 관리로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        this.goodsLoginButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Toast.makeText(getApplicationContext(), "상품 관리로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });
    }
}
