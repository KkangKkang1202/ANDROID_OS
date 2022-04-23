package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends AppCompatActivity
{

    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("로그인 화면과 메뉴 화면");

        this.loginButton = findViewById(R.id.LoginButton);
        this.loginButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivityForResult(intent, 101);
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == 101)
        {
            if(data != null)
            {
                String name = data.getStringExtra("name");
                Toast.makeText(getBaseContext(), name + " 메뉴 클릭됨.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}