package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ClientActivity extends AppCompatActivity
{
    Button clientMenuButton, clientLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.client);
        setTitle("고객 관리 화면");

        this.clientMenuButton = findViewById(R.id.ClientMenuButton);
        this.clientLoginButton = findViewById(R.id.ClientLoginButton);

        this.clientMenuButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            Toast.makeText(getApplicationContext(), "고객 관리로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });

        this.clientLoginButton.setOnClickListener(view ->
        {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Toast.makeText(getApplicationContext(), "고객 관리로부터 이동되었습니다.", Toast.LENGTH_SHORT).show();
            startActivity(intent);
            finish();
        });
    }
}
