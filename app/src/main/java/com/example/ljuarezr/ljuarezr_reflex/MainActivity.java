/*
Ljuarezr-reflex - Reaction timer and Gameshow buzzer application.

Copyright (C)2014, 2015,  Laura Patricia Juarez Reyes, Abram Hindle

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
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button singleButton = (Button) findViewById(R.id.SingleUserButton);
        singleButton.setOnClickListener(new OnClickListener() {
            @Override
             public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, InstructionsActivity.class);
                startActivity(intent);
            }
        });

        Button gameshowButton = (Button) findViewById(R.id.GameShowButton);
        gameshowButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, HowManyPlayersActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void StatisticsToast(MenuItem menu){
        Toast.makeText(this, "Statistics", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, ChooseStatActivity.class );
        startActivity(intent);
    }

    public void EmailStatsToToast(MenuItem menu) {
        Toast.makeText(this, " Email Statistics", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,EmailStatsToActivity.class);
        startActivity(intent);
    }

    public void ClearStatsToast(MenuItem menu) {
        ReactionTimeStatsController rtsController = new ReactionTimeStatsController();
        rtsController.clearAll();
        QuadController quadCounts = new QuadController();
        quadCounts.clear();
        TripleController tripleController = new TripleController();
        tripleController.clear();
        DoubleController doubleController = new DoubleController();
        doubleController.clear();

        Toast.makeText(this, "All Stats cleared", Toast.LENGTH_SHORT).show();
    }



}
