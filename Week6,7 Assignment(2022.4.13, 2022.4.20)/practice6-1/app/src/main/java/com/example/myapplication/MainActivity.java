package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity
{
    Chronometer chronometer1;
    Button buttonStart, buttonEnd;
    RadioButton rdoCal, rdoTime;
    CalendarView calendarView1;
    TimePicker timePicker1;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMinute;
    int selectYear, selectMonth, selectDay;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약(2020039048 김강민)");

        this.chronometer1 = findViewById(R.id.Chronometer1);

        this.buttonStart = findViewById(R.id.ButtonStart);
        this.buttonEnd = findViewById(R.id.ButtonEnd);

        this.rdoCal = findViewById(R.id.RdoCal);
        this.rdoTime = findViewById(R.id.RdoTime);

        this.calendarView1 = findViewById(R.id.CalendarView1);
        this.timePicker1 = findViewById(R.id.TimePicker1);

        this.tvYear = findViewById(R.id.TvYear);
        this.tvMonth = findViewById(R.id.TvMonth);
        this.tvDay = findViewById(R.id.TvDay);
        this.tvHour = findViewById(R.id.TvHour);
        this.tvMinute = findViewById(R.id.TvMinute);

        this.timePicker1.setVisibility(View.INVISIBLE);
        this.calendarView1.setVisibility(View.INVISIBLE);

        this.rdoCal.setOnClickListener(view ->
        {
            this.timePicker1.setVisibility(View.INVISIBLE);
            this.calendarView1.setVisibility(View.VISIBLE);
        });

        this.rdoTime.setOnClickListener(view ->
        {
            this.timePicker1.setVisibility(View.VISIBLE);
            this.calendarView1.setVisibility(View.INVISIBLE);
        });

        this.buttonStart.setOnClickListener(view ->
        {
            this.chronometer1.setBase(SystemClock.elapsedRealtime());
            this.chronometer1.start();
            this.chronometer1.setTextColor(Color.RED);
        });

        this.buttonEnd.setOnClickListener(view ->
        {
            this.chronometer1.stop();
            this.chronometer1.setTextColor(Color.BLUE);
            this.tvYear.setText(String.valueOf(this.selectYear));
            this.tvMonth.setText(String.valueOf(this.selectMonth));
            this.tvDay.setText(String.valueOf(this.selectDay));

            this.tvHour.setText(String.valueOf(this.timePicker1.getCurrentHour()));
            this.tvMinute.setText(String.valueOf(this.timePicker1.getCurrentMinute()));
        });

        this.calendarView1.setOnDateChangeListener((view, year, month, dayOfMonth) ->
        {
            this.selectYear = year;
            this.selectMonth = month + 1;
            this.selectDay = dayOfMonth;
        });
    }
}