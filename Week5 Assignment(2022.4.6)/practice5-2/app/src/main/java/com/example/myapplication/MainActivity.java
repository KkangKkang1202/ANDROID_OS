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
    Button [] numButtons = new Button[10];
    Integer [] numButtonIDs =
            {
              R.id.ButtonNum0, R.id.ButtonNum1, R.id.ButtonNum2, R.id.ButtonNum3, R.id.ButtonNum4,
              R.id.ButtonNum5, R.id.ButtonNum6, R.id.ButtonNum7, R.id.ButtonNum8, R.id.ButtonNum9
            };
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블레이아웃 계산기(2020039048 김강민)");

        this.editText1 = findViewById(R.id.Edit1);
        this.editText2 = findViewById(R.id.Edit2);

        this.buttonAdd = findViewById(R.id.ButtonAdd);
        this.buttonSub = findViewById(R.id.ButtonSub);
        this.buttonMul = findViewById(R.id.ButtonMul);
        this.buttonDiv = findViewById(R.id.ButtonDiv);

        this.textResult = findViewById(R.id.TextResult);

        this.buttonAdd.setOnTouchListener((arg0, arg1) ->
        {
            num1 = this.editText1.getText().toString();
            num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(num1) + Integer.parseInt(num2);
            this.textResult.setText("계산 결과 : " + result);
            return false;
        });

        this.buttonSub.setOnTouchListener((arg0, arg1) ->
        {
            num1 = this.editText1.getText().toString();
            num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(num1) - Integer.parseInt(num2);
            this.textResult.setText("계산 결과 : " + result);
            return false;
        });

        this.buttonMul.setOnTouchListener((arg0, arg1) ->
        {
            num1 = this.editText1.getText().toString();
            num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(num1) * Integer.parseInt(num2);
            this.textResult.setText("계산 결과 : " + result);
            return false;
        });

        this.buttonDiv.setOnTouchListener((arg0, arg1) ->
        {
            num1 = this.editText1.getText().toString();
            num2 = this.editText2.getText().toString();
            this.result = Integer.parseInt(num1) / Integer.parseInt(num2);
            this.textResult.setText("계산 결과 : " + result);
            return false;
        });

        for(i = 0; i < numButtonIDs.length; i++)
        {
            numButtons[i] = (Button)findViewById(numButtonIDs[i]);
        }

        for(i = 0; i < numButtonIDs.length; i++)
        {
            final int index;
            index = i;

            this.numButtons[index].setOnClickListener(view ->
            {
                if(this.editText1.isFocused())
                {
                    this.num1 = this.editText1.getText().toString() + this.numButtons[index].getText().toString();
                    editText1.setText(num1);
                }
                else if(editText2.isFocused())
                {
                    this.num2 = this.editText2.getText().toString() + this.numButtons[index].getText().toString();
                    editText2.setText(num2);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요.", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
}