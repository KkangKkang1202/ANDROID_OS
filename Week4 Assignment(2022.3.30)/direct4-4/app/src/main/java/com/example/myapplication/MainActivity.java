package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView text1, text2;
    Switch aSwitch;
    RadioGroup radioGroup1;
    RadioButton rdoQ, rdoR, rdoS;
    ImageView imageView;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진보기(2020039048 김강민)");

        this.text1 = (TextView) findViewById(R.id.Text1);
        this.text2 = (TextView) findViewById(R.id.Text2);

        this.aSwitch = (Switch) findViewById(R.id.Switch1);

        this.radioGroup1 = (RadioGroup) findViewById(R.id.RadioGroup1);
        this.rdoQ = (RadioButton) findViewById(R.id.RadioButtonQ);
        this.rdoR = (RadioButton) findViewById(R.id.RadioButtonR);
        this.rdoS = (RadioButton) findViewById(R.id.RadioButtonS);

        this.imageView = (ImageView) findViewById(R.id.AndroidImage);

        this.button1 = (Button) findViewById(R.id.Button1);
        this.button2 = (Button) findViewById(R.id.Button2);

        this.aSwitch.setOnCheckedChangeListener((compoundButton, bool) ->
        {
            if(aSwitch.isChecked())
            {
                text2.setVisibility(View.VISIBLE);
                radioGroup1.setVisibility(View.VISIBLE);
                imageView.setVisibility(View.VISIBLE);
            }
            else
            {
                text2.setVisibility(View.INVISIBLE);
                radioGroup1.setVisibility(View.INVISIBLE);
                imageView.setVisibility(View.INVISIBLE);

            }
        });

        this.rdoQ.setOnClickListener(view -> imageView.setImageResource(R.drawable.android10));
        this.rdoR.setOnClickListener(view -> imageView.setImageResource(R.drawable.android11));
        this.rdoS.setOnClickListener(view -> imageView.setImageResource(R.drawable.android12));

        this.button1.setOnClickListener(view ->
        {
            finish();
            System.exit(0);
        });
        this.button2.setOnClickListener(view -> aSwitch.setChecked(false));
    }
}