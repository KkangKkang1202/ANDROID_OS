package com.example.myapplication;

// 2020039048 김강민

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText editText1, editText2;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv;
    TextView textResult;
    String num1, num2;
    Integer result;
    Button [] numberButtons = new Button[10];
    Integer [] numberButtonsID =
            {
                    R.id.NumButton0, R.id.NumButton1, R.id.NumButton2, R.id.NumButton3, R.id.NumButton4,
                    R.id.NumButton5, R.id.NumButton6, R.id.NumButton7, R.id.NumButton8, R.id.NumButton9
            };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("그리드레이아웃 계산기(2020039048 김강민)");

        this.editText1 = findViewById(R.id.EditText1);
        this.editText2 = findViewById(R.id.EditText2);

        this.buttonAdd = findViewById(R.id.ButtonAdd);
        this.buttonSub = findViewById(R.id.ButtonSub);
        this.buttonMul = findViewById(R.id.ButtonMul);
        this.buttonDiv = findViewById(R.id.ButtonDiv);

        this.textResult = findViewById(R.id.TextResult);

        this.buttonAdd.setOnTouchListener((arg0, arg1) ->
        {
            this.num1 = this.editText1.getText().toString();
            this.num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(this.num1) + Integer.parseInt(this.num2);
            this.textResult.setText("계산 결과 : " + result);
            return (false);
        });

        this.buttonSub.setOnTouchListener((arg0, arg1) ->
        {
            this.num1 = this.editText1.getText().toString();
            this.num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(this.num1) - Integer.parseInt(this.num2);
            this.textResult.setText("계산 결과 : " + result);
            return (false);
        });

        this.buttonMul.setOnTouchListener((arg0, arg1) ->
        {
            this.num1 = this.editText1.getText().toString();
            this.num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(this.num1) * Integer.parseInt(this.num2);
            this.textResult.setText("계산 결과 : " + result);
            return (false);
        });

        this.buttonDiv.setOnTouchListener((arg0, arg1) ->
        {
            this.num1 = this.editText1.getText().toString();
            this.num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(this.num1) / Integer.parseInt(this.num2);
            this.textResult.setText("계산 결과 : " + result);
            return (false);
        });

        for(int i=0; i < numberButtonsID.length; i++)
        {
            numberButtons[i] = findViewById(numberButtonsID[i]);
        }

        for(int i=0; i < numberButtonsID.length; i++)
        {
            final int index;
            index = i;

            numberButtons[index].setOnClickListener(view ->
            {
                if(this.editText1.isFocused())
                {
                    this.num1 = this.editText1.getText().toString() + numberButtons[index].getText().toString();
                    this.editText1.setText(this.num1);
                }
                else if(editText2.isFocused())
                {
                    this.num2 = this.editText2.getText().toString() + numberButtons[index].getText().toString();
                    this.editText2.setText(this.num2);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}