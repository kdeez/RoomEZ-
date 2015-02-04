package com.example.anthonygrisaffi.roomez;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainBoard extends ActionBarActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_board);


        //Added by anthony January 29, 2015


    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_board, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        //int id = item.getItemId();


        switch (item.getItemId()) {

            case R.id.action_settings:
                // action_settings
                return true;
            case R.id.action_gm:
                // location found
                Intent i = new Intent(this, GroupMessage.class);
                startActivity(i);
                // refresh
                return true;
            case R.id.action_cal:
                Intent b = new Intent(this, CalendarActivity.class);
                startActivity(b);
                return true;
            case R.id.action_sticky:
                Intent c = new Intent(this,MainBoard.class);
                startActivity(c);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


        //noinspection SimplifiableIfStatement

        /*
        These if conditions check to see if the action bar buttons are pressed.
        Their id's are located in menu_main_board. The sticky and the gm one should be working.
        We need to investigate destroying the activities so they don't stay active the whole time.
         */



        /*if (id == R.id.action_cal)
        {
            startActivity(new Intent(this,));
        }*/
}
