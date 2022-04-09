package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setTitle("직접 풀어보기 5-3. (2020039048 김강민)");
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        EditText editText = new EditText(this);
        editText.setHint("문자열을 입력하세요.");

        Button button = new Button(this);
        button.setText("버튼입니다.");
        button.setBackgroundColor(Color.rgb(173,255,47));

        TextView textView = new TextView(this);

        button.setOnClickListener(view ->
        {
            if(editText.getText().toString().equals(""))
            {
                Toast.makeText(getApplicationContext(), "문자열을 입력하세요.", Toast.LENGTH_SHORT).show();
            }
            else
            {
                textView.setText(editText.getText().toString());
                textView.setTextColor(Color.rgb(204,51,204));
                textView.setTextSize(25);
            }
        });

        baseLayout.addView(editText);
        baseLayout.addView(button);
        baseLayout.addView(textView);
    }
}