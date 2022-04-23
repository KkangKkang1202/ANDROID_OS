package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText id, password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("로그인 화면");

        this.id = findViewById(R.id.idEditText);
        this.password = findViewById(R.id.passwordEditText);

        this.loginButton = findViewById(R.id.LoginButton);

        this.loginButton.setOnClickListener(view ->
        {
            if(id.getText().toString().equals("") || password.getText().toString().equals(""))
            {
                Toast.makeText(getApplicationContext(), "아이디와 비밀번호를 입력하세요.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                Toast.makeText(getApplicationContext(), "로그인 되었습니다.", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });
    }
}