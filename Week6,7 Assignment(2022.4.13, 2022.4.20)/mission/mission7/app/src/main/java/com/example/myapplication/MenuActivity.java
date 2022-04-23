package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity
{
    Button clientButton, salesButton, goodsButton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        this.setTitle("로그인 화면과 메뉴 화면");

        this.clientButton = findViewById(R.id.ClientButton);
        this.salesButton = findViewById(R.id.SalesButton);
        this.goodsButton = findViewById(R.id.GoodsButton);

        this.clientButton.setOnClickListener(view ->
        {
            Intent intent = new Intent();
            intent.putExtra("name", "고객 관리");
            setResult(Activity.RESULT_OK, intent);
            finish();
        });

        this.salesButton.setOnClickListener(view ->
        {
            Intent intent = new Intent();
            intent.putExtra("name", "매출 관리");
            setResult(Activity.RESULT_OK, intent);
            finish();
        });

        this.goodsButton.setOnClickListener(view ->
        {
            Intent intent = new Intent();
            intent.putExtra("name", "상품 관리");
            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}
