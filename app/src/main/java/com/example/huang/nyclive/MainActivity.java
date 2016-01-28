package com.example.huang.nyclive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button camera = (Button) findViewById(R.id.button);
        Button setting = (Button) findViewById(R.id.button2);
        Button comment = (Button) findViewById(R.id.button3);

        camera.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Camera.class);
                startActivity(intent);
            }
        });

        setting.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

            }
        });

        comment.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

            }
        });
    }
}
