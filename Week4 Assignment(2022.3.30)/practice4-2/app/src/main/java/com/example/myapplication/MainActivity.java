package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView text1, text2;
    CheckBox chkAgree;
    RadioGroup radioGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit;
    Button btnOK;
    ImageView imgPet;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기(2020039048 김강민)");

        this.text1 = (TextView) findViewById(R.id.Text1);
        this.chkAgree = (CheckBox) findViewById(R.id.ChkAgree);

        this.text2 = (TextView) findViewById(R.id.Text2);
        this.radioGroup1 = (RadioGroup) findViewById(R.id.Rgroup1);
        this.rdoDog = (RadioButton) findViewById(R.id.RdoDog);
        this.rdoCat = (RadioButton) findViewById(R.id.RdoCat);
        this.rdoRabbit = (RadioButton) findViewById(R.id.RdoRabbit);

        this.btnOK = (Button) findViewById(R.id.BtnOK);
        this.imgPet = (ImageView) findViewById(R.id.ImgPet);

        this.chkAgree.setOnCheckedChangeListener((buttonView, isChecked) ->
        {

            if(chkAgree.isChecked())
            {
                text2.setVisibility(View.VISIBLE);
                radioGroup1.setVisibility(View.VISIBLE);
                btnOK.setVisibility(View.VISIBLE);
                imgPet.setVisibility(View.VISIBLE);
            }
            else
            {
                text2.setVisibility(View.INVISIBLE);
                radioGroup1.setVisibility(View.INVISIBLE);
                btnOK.setVisibility(View.INVISIBLE);
                imgPet.setVisibility(View.INVISIBLE);
            }
        });

        this.btnOK.setOnClickListener(arg0 ->
        {
            switch (radioGroup1.getCheckedRadioButtonId())
            {
                case R.id.RdoDog:
                    this.imgPet.setImageResource(R.drawable.dog);
                    break;

                case R.id.RdoCat:
                    this.imgPet.setImageResource(R.drawable.cat);
                    break;

                case R.id.RdoRabbit:
                    this.imgPet.setImageResource(R.drawable.rabbit);
                    break;

                default:
                    Toast.makeText(getApplicationContext(), "동물을 먼저 선택하세요.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}