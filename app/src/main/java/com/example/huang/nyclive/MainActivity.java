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
                Intent intent = new Intent(MainActivity.this,CameraListView.class);
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
