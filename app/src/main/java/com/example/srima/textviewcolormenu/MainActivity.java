package com.example.srima.textviewcolormenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView)findViewById(R.id.text);
    }
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_textview, menu);
    return super.onCreateOptionsMenu(menu);
}


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.MENU_RED:
                tv.setTextColor(Color.RED);
                break;
            case R.id.MENU_BLUE:
                tv.setTextColor(Color.BLUE);
                break;
            case R.id.MENU_GREY:
                tv.setTextColor(Color.GRAY);
        }

        return super.onOptionsItemSelected(item);
    }
}


