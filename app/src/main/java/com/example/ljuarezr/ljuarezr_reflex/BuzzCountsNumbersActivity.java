package com.example.ljuarezr.ljuarezr_reflex;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BuzzCountsNumbersActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buzzcountsnumberslayout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_buzz_counts_numbers, menu);
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

    public void getCounts(View v){
        Toast.makeText(this, "Getting Stats...", Toast.LENGTH_SHORT).show();

        DoubleController doubleController = new DoubleController();
        TripleController tripleController = new TripleController();
        QuadController  quadController = new QuadController();

        //set the double counts in their view
        TextView v12 = (TextView) findViewById( R.id.P12Value);
        v12.setText(Integer.toString(doubleController.getP12()));
        TextView v22 = (TextView) findViewById( R.id.P22Value);
        v22.setText(Integer.toString(doubleController.getP22()));

        //set the triple counts in their view
        TextView v13 = (TextView) findViewById( R.id.P13Value);
        v13.setText(Integer.toString(tripleController.getP13()));
        TextView v23 = (TextView) findViewById( R.id.P23Value);
        v23.setText(Integer.toString(tripleController.getP23()));
        TextView v33 = (TextView) findViewById( R.id.P33Value);
        v33.setText(Integer.toString(tripleController.getP33()));

        //set the quad counts in their view
        TextView v14 = (TextView) findViewById( R.id.P14Value);
        v14.setText(Integer.toString(quadController.getP14()));
        TextView v24 = (TextView) findViewById( R.id.P24Value);
        v24.setText(Integer.toString(quadController.getP24()));
        TextView v34 = (TextView) findViewById( R.id.P34Value);
        v34.setText( Integer.toString(quadController.getP34()));
        TextView v44 = (TextView) findViewById( R.id.P44Value);
        v44.setText(Integer.toString(quadController.getP44()));
    }
}
