package com.example.sandeep.popupmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showPopUpMenu(View v){

        PopupMenu menu=new PopupMenu(this,v);
        MenuInflater inflater=menu.getMenuInflater();
        inflater.inflate(R.menu.pop_up_menu,menu.getMenu());
        menu.show();

    }
}
