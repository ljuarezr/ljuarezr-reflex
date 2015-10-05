package com.example.ljuarezr.ljuarezr_reflex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmailStatsToActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emaillayout);

        android.widget.EditText recipient = (EditText) findViewById(R.id.EmailTextBox);
        final String destination = recipient.getText().toString();

        Button sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                sendAction(destination);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_email_stats_to, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendAction(String destination){

        Toast.makeText(EmailStatsToActivity.this, "Emailing Stats...", Toast.LENGTH_SHORT);
/*
        //http://examples.javacodegeeks.com/android/core/email/android-sending-email-example/
        //Katerina Zamani, Dec 18, 2013
        Intent email = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        email.setType("message/rfc822");
        StringStats stringStats = new StringStats();

        email.putExtra(Intent.EXTRA_EMAIL, destination);
        email.putExtra(Intent.EXTRA_SUBJECT, "Buzzer App Stats");
        email.putExtra(Intent.EXTRA_TEXT, stringStats.getStats());
        try {
            startActivity(Intent.createChooser(email, "Choose from:"));
        } catch (android.content.ActivityNotFoundException e){
            Toast.makeText(this, "No compatible Activity Found :(", Toast.LENGTH_SHORT);
        }
        */
    }
}

