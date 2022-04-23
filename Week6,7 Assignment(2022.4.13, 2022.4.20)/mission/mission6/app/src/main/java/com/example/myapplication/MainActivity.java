package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    SeekBar seekBar1;
    ProgressBar progressBar1;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시크바와 프로그레스바 보여주기");

        this.seekBar1 = findViewById(R.id.SeekBar1);
        this.progressBar1 = findViewById(R.id.ProgressBar1);
        this.textView1 = findViewById(R.id.TextView1);

        this.seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                MainActivity.this.progressBar1.setProgress(i);
                MainActivity.this.textView1.setText(String.valueOf(i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });
    }
}