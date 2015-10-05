package com.example.ljuarezr.ljuarezr_reflex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HowManyPlayersActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.numberplayerslayout);

        Button twoPlayersButton = (Button) findViewById(R.id.twoPlayersButton);
        twoPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(HowManyPlayersActivity.this, DoubleBuzzerActivity.class);
                startActivity(intent);
            }
        });

        Button threePlayersButton = (Button) findViewById(R.id.threePlayersButton);
        threePlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(HowManyPlayersActivity.this, TripleBuzzerActivity.class);
                startActivity(intent);
            }
        });

        Button fourPlayersButton = (Button) findViewById(R.id.fourPlayersButton);
        fourPlayersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(HowManyPlayersActivity.this, QuadBuzzerActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_how_many_players, menu);
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
