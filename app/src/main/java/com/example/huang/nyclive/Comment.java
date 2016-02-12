package com.example.huang.nyclive;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Comment extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        Button back = (Button) findViewById(R.id.back_button);

        back.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Comment.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        }

    public void sendFeedback(View v) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "weihuang023@yahoo.com");
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Feedback of LiveCam");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "What do you think?");
        try {
            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
            finish();
            Log.d("Finished sending email", "");
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(
                    Comment.this,
                    "There is no email client installed.",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
