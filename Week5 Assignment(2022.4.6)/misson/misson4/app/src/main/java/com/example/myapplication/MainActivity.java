package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    EditText editText1;
    TextView textView1;
    Button button1;
    Button button2;

    int maxLength = 80;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SMS 입력화면");

        this.editText1 = findViewById(R.id.EditText1);
        this.textView1 = findViewById(R.id.TextView1);

        this.button1 = findViewById(R.id.Button1);
        this.button2 = findViewById(R.id.Button2);

        this.textView1.setText(editText1.getText().toString().getBytes().length + " / " + maxLength + "바이트");

        this.editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                String string = editText1.getText().toString().getBytes().length + " / " + maxLength + "바이트";
                textView1.setText(string);
            }

            @Override
            public void afterTextChanged(Editable editable) {}
        });

        this.button1.setOnClickListener(view ->
        {
            String text = editText1.getText().toString();
            Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
        });

        this.button2.setOnClickListener(view ->
        {
            finish();
            System.exit(1);
        });
    }
}