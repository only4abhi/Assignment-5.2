package com.example.abhishek.android52;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mob:
                Toast.makeText(getApplicationContext(),"Mobile Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.comp:
                Toast.makeText(getApplicationContext(),"Computer Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.gpd:
                Toast.makeText(getApplicationContext(),"Gamepad Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.camera:
                Toast.makeText(getApplicationContext(),"Camera Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.video:
                Toast.makeText(getApplicationContext(),"Video Selected", Toast.LENGTH_LONG).show();
                break;
            case R.id.email:
                Toast.makeText(getApplicationContext(),"Email Selected", Toast.LENGTH_LONG).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
