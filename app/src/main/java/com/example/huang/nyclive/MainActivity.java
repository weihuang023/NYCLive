package com.example.huang.nyclive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button camera = (Button) findViewById(R.id.camera_button);
        camera.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CameraListView.class);
                startActivity(intent);
            }
        });

        Button aboutButton = (Button) findViewById(R.id.button);
        aboutButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,About.class);
                startActivity(intent);
            }
        });

        Button manhattanButton = (Button) findViewById(R.id.manhattanButton);
        manhattanButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ManhattanCam.class);
                startActivity(intent);
            }
        });

        Button queensButton = (Button) findViewById(R.id.queensButton);
        queensButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,QueensCam.class);
                startActivity(intent);
            }
        });

        Button bronxButton = (Button) findViewById(R.id.bronxButton);
        bronxButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BronxCam.class);
                startActivity(intent);
            }
        });

        Button brooklynButton = (Button) findViewById(R.id.brooklynButton);
        brooklynButton.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BrooklynCam.class);
                startActivity(intent);
            }
        });

    }

    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.settings:
                startActivity(new Intent(this, Setting.class));
                return true;
            case R.id.comments:
                startActivity(new Intent(this,Comment.class));
                return true;
        }
        return false;
    }
}
