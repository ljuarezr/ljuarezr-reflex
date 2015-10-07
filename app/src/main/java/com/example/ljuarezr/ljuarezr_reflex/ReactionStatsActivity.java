
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
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.Random;

public class ReactionStatsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reactiontimeslayout);

        Button minButton = (Button) findViewById(R.id.MinimumButton);
        minButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                minimumChosen(arg0);
            }
        });

        Button maxButton = (Button) findViewById(R.id.MaximumButton);
        maxButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                maximumChosen(arg0);
            }
        });

        Button avgButton = (Button) findViewById(R.id.AverageButton);
        avgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                averageChosen(arg0);

            }
        });

        Button medButton = (Button) findViewById(R.id.MedianButton);
        medButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                medianChosen(arg0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_reaction_stats, menu);
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

    public void minimumChosen(View v) {
        Toast.makeText(this, "Minimum", Toast.LENGTH_SHORT).show();
        ReactionTimeStatsController rtsController = new ReactionTimeStatsController();
        try {
            ArrayList<Integer> minList = (ArrayList) rtsController.getMinBuzz();
            //Set the values in list in the view
            TextView vlast10 = (TextView) findViewById( R.id.Last10Times);
            vlast10.setText(Integer.toString(minList.get(0)));
            TextView vlast100 = (TextView) findViewById( R.id.Last100TimesValue);
            vlast100.setText(Integer.toString(minList.get(1)));
            TextView valltime = (TextView) findViewById( R.id.AllTimeValue);
            valltime.setText(Integer.toString(minList.get(2)));

        } catch (EmptyReactionTimesListException e){
            Toast.makeText(this, "There are no times recorded yet!", Toast.LENGTH_SHORT);
        }


    }
    public void maximumChosen(View v) {
        Toast.makeText(this, "Maximum", Toast.LENGTH_SHORT).show();
        ReactionTimeStatsController rtsController = new ReactionTimeStatsController();
        try {
            ArrayList<Integer> maxList = (ArrayList) rtsController.getMaxBuzz();
            //Set the values in list in the view
            TextView vlast10 = (TextView) findViewById( R.id.Last10Times);
            vlast10.setText(Integer.toString(maxList.get(0)));
            TextView vlast100 = (TextView) findViewById( R.id.Last100TimesValue);
            vlast100.setText(Integer.toString(maxList.get(1)));
            TextView valltime = (TextView) findViewById( R.id.AllTimeValue);
            valltime.setText(Integer.toString(maxList.get(2)));

        } catch (EmptyReactionTimesListException e){
            Toast.makeText(this, "There are no times recorded yet!", Toast.LENGTH_SHORT);
        }
    }
    public void averageChosen(View v) {
        Toast.makeText(this, "Average", Toast.LENGTH_SHORT).show();
        ReactionTimeStatsController rtsController = new ReactionTimeStatsController();
        try {
            ArrayList<Integer> avgList = (ArrayList) rtsController.getAvgBuzz();
            //Set the values in list in the view
            TextView vlast10 = (TextView) findViewById( R.id.Last10Times);
            vlast10.setText(Integer.toString(avgList.get(0)));
            TextView vlast100 = (TextView) findViewById( R.id.Last100TimesValue);
            vlast100.setText(Integer.toString(avgList.get(1)));
            TextView valltime = (TextView) findViewById( R.id.AllTimeValue);
            valltime.setText(Integer.toString(avgList.get(2)));
        } catch (EmptyReactionTimesListException e){
            Toast.makeText(this, "There are no times recorded yet!", Toast.LENGTH_SHORT);
        }
    }
    public void medianChosen(View v) {
        Toast.makeText(this, "Median", Toast.LENGTH_SHORT).show();
        ReactionTimeStatsController rtsController = new ReactionTimeStatsController();
        try {
            ArrayList<Integer> medList = (ArrayList) rtsController.getMedBuzz();
            //Set the values in list in the view
            TextView vlast10 = (TextView) findViewById( R.id.Last10Times);
            vlast10.setText(Integer.toString(medList.get(0)));
            TextView vlast100 = (TextView) findViewById( R.id.Last100TimesValue);
            vlast100.setText(Integer.toString(medList.get(1)));
            TextView valltime = (TextView) findViewById( R.id.AllTimeValue);
            valltime.setText(Integer.toString(medList.get(2)));
        } catch (EmptyReactionTimesListException e){
            Toast.makeText(this, "There are no times recorded yet!", Toast.LENGTH_SHORT);
        }
    }
}
