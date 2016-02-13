package com.example.huang.nyclive;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Camera extends AppCompatActivity {


    @SuppressLint("SetJavaScriptEnabled")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        Intent intent = getIntent();
        String address = intent.getExtras().getString("loc");

        int interval = 1000;

        if(  getIntent().getExtras() != null && getIntent().getExtras().getInt("interval") != 0)
            interval = getIntent().getExtras().getInt("interval");
        if ( getIntent().getExtras() != null && getIntent().getExtras().getString("address") != null)
            address = getIntent().getExtras().getString("address");

        String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<script type=\"text/javascript\">\n" +
                "\n" +
                "function onload(){\n" +
                "\n" +
                "\tdocument.getElementById(\"myPic\").src = '"+address+"'+'?math='+Math.random();\n" +
                "\tsetTimeout(\"onload()\","+interval+");\n" +
                "}\n" +
                "\n" +
                "</script>\n" +
                "</head>\n" +
                "<body onload=\"onload()\">\n" +
                "<center>\n" +
                "\n" +
                "<img id=\"myPic\"  />\n" +
                "\n" +
                "</center>\n" +
                "</body>\n" +
                "</html>";
        WebView mWebView;

        mWebView = (WebView) findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadData(html, "text/html", null);


        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Camera.this, MainActivity.class);
                startActivity(intent);
            }
        });


        Button setting = (Button) findViewById(R.id.settings_button);

        setting.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Camera.this,Setting.class);
                startActivity(intent);
            }
        });
    }
}
