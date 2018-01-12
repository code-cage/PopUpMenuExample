package com.example.sandeep.popupmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

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

        menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id=menuItem.getItemId();

                switch (id){
                    case R.id.item1:
                        Toast.makeText(MainActivity.this,"item 1 clicked",Toast.LENGTH_LONG).show();
                        break;

                    case R.id.item2 :
                        Toast.makeText(MainActivity.this,"item 2 clicked",Toast.LENGTH_LONG).show();
                        break;
                    case R.id.item3 :
                        Toast.makeText(MainActivity.this,"item 3 clicked",Toast.LENGTH_LONG).show();
                        break;

                }



                return false;
            }
        });

    }
}
