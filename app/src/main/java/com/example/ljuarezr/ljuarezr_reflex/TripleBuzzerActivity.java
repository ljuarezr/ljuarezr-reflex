package com.example.ljuarezr.ljuarezr_reflex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TripleBuzzerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triplebuzzerlayout);

        Button player1Button = (Button) findViewById(R.id.PlayerOneBuzzer);
        player1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TripleController tripleCounts = new TripleController();
                tripleCounts.incrementP1();
                Intent intent = new Intent(TripleBuzzerActivity.this, Player1WinsActivity.class);
                startActivity(intent);
            }
        });


        Button player2Button = (Button) findViewById(R.id.PlayerTwoBuzzer);
        player2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TripleController tripleCounts = new TripleController();
                tripleCounts.incrementP2();
                Intent intent = new Intent(TripleBuzzerActivity.this,  Player2WinsActivity.class);
                startActivity(intent);
            }
        });

        Button player3Button = (Button) findViewById(R.id.PlayerThreeBuzzer);
        player3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                TripleController tripleCounts = new TripleController();
                tripleCounts.incrementP3();
                Intent intent = new Intent(TripleBuzzerActivity.this,  Player3WinsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_triple_buzzer, menu);
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
}
