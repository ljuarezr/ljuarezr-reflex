
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


import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.SimpleAdapter.ViewBinder;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;


public class SingleBuzzerActivity extends ActionBarActivity {

    private Handler handler = new Handler();
    private SimpleAdapter.ViewBinder adapter;

    protected TimerTask clickPrompt = new TimerTask(){
        @Override
        public void run(){
            TextView x = (TextView) findViewById( R.id.ClickPrompt);
            x.setText("Click NOW!");
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singlebuttonlayout);



        Button startButton = (Button) findViewById(R.id.StartButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                long minStart = 10; //in milliseconds
                long maxStart = 2001;
                //http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
                //user: TJ_Fischer, Dec 12/08
                long promptSignalTime = minStart + (long)(Math.random())*((maxStart - minStart));
                Timer promptTimer = new Timer();
                promptTimer.schedule(clickPrompt, promptSignalTime);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_single_buzzer, menu);
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

    public void startGame(View v){

    }
}
