package com.kikisnight.colmenarviejotourguide;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the sightseeing/greenZones/restaurants/council category
        TextView sightseeing = (TextView)findViewById(R.id.sightseeing);
        sightseeing.setOnClickListener(this);

        TextView greenZones = (TextView)findViewById(R.id.greenZones);
        greenZones.setOnClickListener(this);

        TextView restaurants = (TextView)findViewById(R.id.restaurants);
        restaurants.setOnClickListener(this);

        TextView council = (TextView)findViewById(R.id.council);
        council.setOnClickListener(this);
     }


    // Set a click listener on that View - Using switch statement to handle all button
    @Override
    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.sightseeing:
                Intent sightseeingIntent = new Intent (MainActivity.this, SightseeingActivity.class);
                startActivity(sightseeingIntent);
                break;

            case R.id.greenZones:
                Intent greenZonesIntent = new Intent (MainActivity.this, GreenZonesActivity.class);
                startActivity(greenZonesIntent);
                break;

            case R.id.restaurants:
                Intent restaurantsIntent = new Intent (MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
                break;
            case R.id.council:
                Intent councilIntent = new Intent (MainActivity.this, CouncilActivity.class);
                startActivity(councilIntent);
                break;
        }

    }

}
