/*
This file is a part of the App Portfolio project. It was created to fulfil the Udacity Android Nanodegree
program requirements.
Copyright (C) 2015 <Joshua Urlaub>

App Portfolio  is a demonstration of learning and ability. It is not intended to be distributed
and is WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

 */



package com.example.android.app_portfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.Button;
import android.content.Context;


public class MainActivity extends ActionBarActivity {



    int duration = Toast.LENGTH_SHORT;

    // Button button1  // the direct method for button1 action was used as a test
    Button button2 = (Button) findViewById(R.id.appButton2);
    Button button3 = (Button) findViewById(R.id.appButton3);
    Button button4 = (Button) findViewById(R.id.appButton4);
    Button button5 = (Button) findViewById(R.id.appButton5);
    Button button6 = (Button) findViewById(R.id.appButton6);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /* button1...
            This is the space for button1.setOnClickListener. Since button1 used the direct method
            of creating an action the method <public void appOne(View view)> takes its place.

         */

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();

                Toast toast = Toast.makeText(context, R.string.app2_message, duration);
                toast.show();
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();

                Toast toast = Toast.makeText(context, R.string.app3_message, duration);
                toast.show();
            }
        });



        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();

                Toast toast = Toast.makeText(context, R.string.app4_message, duration);
                toast.show();
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();

                Toast toast = Toast.makeText(context, R.string.app5_message, duration);
                toast.show();
            }
        });



        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();

                Toast toast = Toast.makeText(context, R.string.app6_message, duration);
                toast.show();
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



    // Hard Coded Button Action --Do not use if fragments are needed-- Use the button1.onClickListener approach
    public void appOne(View view){

        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, R.string.app1_message, duration );
        toast.show();

    }




}
