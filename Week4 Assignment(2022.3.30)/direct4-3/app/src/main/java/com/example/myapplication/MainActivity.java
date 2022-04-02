package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRemainder;
    TextView textResult;
    String num1, num2;
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(2020039048 김강민)");

        this.edit1 = (EditText) findViewById(R.id.Edit1);
        this.edit2 = (EditText) findViewById(R.id.Edit2);

        this.btnAdd = (Button) findViewById(R.id.BtnAdd);
        this.btnSub = (Button) findViewById(R.id.BtnSub);
        this.btnMul = (Button) findViewById(R.id.BtnMul);
        this.btnDiv = (Button) findViewById(R.id.BtnDiv);
        this.btnRemainder = (Button) findViewById(R.id.BtnRemainder);

        this.textResult = (TextView) findViewById(R.id.TextResult);

        this.btnAdd.setOnClickListener(view ->
        {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            if(num1.equals("") || num2.equals(""))
            {
                Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result);
            }
        });

        this.btnSub.setOnClickListener(view ->
        {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            if(num1.equals("") || num2.equals(""))
            {
                Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result);
            }
        });

        this.btnMul.setOnClickListener(view ->
        {
            if(num1.equals("") || num2.equals(""))
            {
                Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result);
            }
        });

        this.btnDiv.setOnClickListener(view ->
        {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            if(num1.equals("") || num2.equals(""))
            {
                Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show();
            }
            else if(num2.equals("0"))
            {
                Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result);
            }
        });

        this.btnRemainder.setOnClickListener(view ->
        {
            num1 = edit1.getText().toString();
            num2 = edit2.getText().toString();
            if(num1.equals("") || num2.equals(""))
            {
                Toast.makeText(getApplicationContext(), "값을 입력하지 않았습니다.", Toast.LENGTH_SHORT).show();
            }
            else if(num2.equals("0"))
            {
                Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                result = Double.parseDouble(num1) % Double.parseDouble(num2);
                textResult.setText("계산 결과 : " + result);
            }
        });
    }
}