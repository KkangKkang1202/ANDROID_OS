package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity
{
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, view, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        if(view == this.button1)
        {
            menu.setHeaderTitle("배경색 변경");
            menuInflater.inflate(R.menu.menu1, menu);
        }

        if(view == this.button2)
        {
            menuInflater.inflate(R.menu.menu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.itemRed:
                this.baseLayout.setBackgroundColor(Color.RED);
                return (true);

            case R.id.itemGreen:
                this.baseLayout.setBackgroundColor(Color.GREEN);
                return (true);

            case R.id.itemBlue:
                this.baseLayout.setBackgroundColor(Color.BLUE);
                return (true);

            case R.id.subRotate:
                this.button2.setRotation(45);
                return (true);

            case R.id.subSize:
                this.button2.setScaleX(2);
                return (true);

            default:
                break;
        }
        return (false);
    }

    LinearLayout baseLayout;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기(컨텍스트 메뉴) (2020039048 김강민");

        this.baseLayout = findViewById(R.id.baseLayout);

        this.button1 = findViewById(R.id.Button1);
        this.button2 = findViewById(R.id.Button2);

        registerForContextMenu(this.button1);
        registerForContextMenu(this.button2);
    }
}