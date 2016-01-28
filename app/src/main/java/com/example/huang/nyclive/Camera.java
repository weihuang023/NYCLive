package com.example.huang.nyclive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Camera extends AppCompatActivity {

    // TODO: 1/28/16 Back to Main Activity 

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        Button back = (Button) findViewById(R.id.button);

        back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Camera.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button setting = (Button) findViewById(R.id.button1);

        setting.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Camera.this,Setting.class);
                startActivity(intent);
            }
        });
    }
}
