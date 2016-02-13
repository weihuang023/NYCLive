package com.example.huang.nyclive;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Comment extends Activity {

    private EditText subject;
    private EditText body;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);


        subject = (EditText) findViewById(R.id.subject);
        body = (EditText) findViewById(R.id.body);

        Button sendBtn = (Button) findViewById(R.id.sendEmail);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendEmail();
                // after sending the email, clear the fields
                subject.setText("");
                body.setText("");
            }
        });
    }
    protected void sendEmail() {
        Log.i("Send email", "");

        String[] recipients = {"weih81888@gmail.com"};
        Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        // prompts email clients only
        email.setType("message/rfc822");

        email.putExtra(Intent.EXTRA_EMAIL, recipients);
        email.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
        email.putExtra(Intent.EXTRA_TEXT, body.getText().toString());

        try {
            // the user can choose the email client
            startActivity(Intent.createChooser(email, "Choose an email client from..."));
            finish();
            Log.i("Finished sending email", "");

        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(Comment.this, "No email client installed.",
                    Toast.LENGTH_LONG).show();
        }
    }
}