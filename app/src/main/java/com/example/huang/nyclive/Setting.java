package com.example.huang.nyclive;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Setting extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        Button back = (Button) findViewById(R.id.button);

        back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Setting.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
