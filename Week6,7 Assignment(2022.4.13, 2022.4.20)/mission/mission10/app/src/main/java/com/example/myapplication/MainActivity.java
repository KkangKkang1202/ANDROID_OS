package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;
import android.widget.Toast;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity
{

    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo)
    {
        super.onCreateContextMenu(menu, view, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        if(view == this.goButton)
        {
            menuInflater.inflate(R.menu.menu, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case R.id.GoMenu1:
                this.tabHost.setCurrentTab(0);
                return (true);

            case R.id.GoMenu2:
                this.tabHost.setCurrentTab(1);
                return (true);

            case R.id.GoMenu3:
                this.tabHost.setCurrentTab(2);
                return (true);

            default:
                return (false);
        }
    }

    Button menu1_Button, menu2_Button, menu3_Button, goButton;
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.menu1_Button = findViewById(R.id.Menu1_Button);
        this.menu2_Button = findViewById(R.id.Menu2_Button);
        this.menu3_Button = findViewById(R.id.Menu3_Button);
        this.goButton = findViewById(R.id.GoButton);
        this.tabHost = getTabHost();

        this.menu1_Button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "메뉴1에 있습니다.", Toast.LENGTH_SHORT).show());
        this.menu2_Button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "메뉴2에 있습니다.", Toast.LENGTH_SHORT).show());
        this.menu3_Button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "메뉴3에 있습니다.", Toast.LENGTH_SHORT).show());


        TabHost.TabSpec tabSpecMenu1 = tabHost.newTabSpec("fragment1").setIndicator("메뉴1");
        tabSpecMenu1.setContent(R.id.Fragment1);
        tabHost.addTab(tabSpecMenu1);

        TabHost.TabSpec tabSpecMenu2 = tabHost.newTabSpec("fragment2").setIndicator("메뉴2");
        tabSpecMenu2.setContent(R.id.Fragment2);
        tabHost.addTab(tabSpecMenu2);

        TabHost.TabSpec tabSpecMenu3 = tabHost.newTabSpec("fragment3").setIndicator("메뉴3");
        tabSpecMenu3.setContent(R.id.Fragment3);
        tabHost.addTab(tabSpecMenu3);

        tabHost.setCurrentTab(0);
        registerForContextMenu(this.goButton);
    }
}