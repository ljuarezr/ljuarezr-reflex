
/*
Ljuarezr-reflex - Reaction timer and Gameshow buzzer application.
Copyright (C)2015,  Laura Patricia Juarez Reyes
This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.
 */

package com.example.ljuarezr.ljuarezr_reflex;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DoubleBuzzerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doublebuttonlayout);

        Button player1Button = (Button) findViewById(R.id.PlayerOneBuzzer);
        player1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                DoubleController doubleCounts = new DoubleController();
                doubleCounts.incrementP1();
                Intent intent = new Intent(DoubleBuzzerActivity.this, Player1WinsActivity.class);
                startActivity(intent);
            }
        });

        Button player2Button = (Button) findViewById(R.id.PlayerTwoBuzzer);
        player2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(DoubleBuzzerActivity.this, "Player 2", Toast.LENGTH_SHORT);
                DoubleController doubleCounts = new DoubleController();
                doubleCounts.incrementP2();
                Intent intent = new Intent(DoubleBuzzerActivity.this,  Player2WinsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_double_buzzer, menu);
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
