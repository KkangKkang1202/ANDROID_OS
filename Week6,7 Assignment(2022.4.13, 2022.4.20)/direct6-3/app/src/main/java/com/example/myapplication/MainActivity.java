package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

// 2020039048 김 강 민

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("동물 선택 앱(2020039048 김강민)");

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("IMAGEDOG").setIndicator("강아지");
        tabSpecDog.setContent(R.id.imageDog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("IMAGECAT").setIndicator("고양이");
        tabSpecCat.setContent(R.id.imageCat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("IMAGERABBIT").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.imageRabbit);
        tabHost.addTab(tabSpecRabbit);

        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("IMAGEHORSE").setIndicator("말");
        tabSpecHorse.setContent(R.id.imageHorse);
        tabHost.addTab(tabSpecHorse);

        tabHost.setCurrentTab(0);
    }
}