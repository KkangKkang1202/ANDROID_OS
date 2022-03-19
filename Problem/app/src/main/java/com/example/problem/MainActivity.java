package com.example.problem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.net.Uri;

// 2020039048 김강민

public class MainActivity extends AppCompatActivity
{
    Button button1;
    Button button2;

    EditText editText;

    RadioGroup radioGroup;
    RadioButton image1;
    RadioButton image2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon);

        editText = (EditText)findViewById(R.id.editText);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(view ->
            Toast.makeText(getApplicationContext(), editText.getText().toString(), Toast.LENGTH_SHORT).show()
        );

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(view -> {
            Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString()));
            startActivity(urlIntent);
        });

        radioGroup = (RadioGroup)findViewById(R.id.RadioGroup);
        image1 = (RadioButton)findViewById(R.id.image1);
        image2 = (RadioButton)findViewById(R.id.image2);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.android12);

        image1.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.android11);
            imageView.setVisibility(View.VISIBLE);
        });

        image2.setOnClickListener(view -> {
            imageView.setImageResource(R.drawable.android12);
            imageView.setVisibility(View.VISIBLE);
        });
    }
}