package com.kikisnight.colmenarviejotourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the sightseeing/greenZones/restaurants/council category
        TextView sightseeing = (TextView)findViewById(R.id.sightseeing);
        TextView greenZones = (TextView)findViewById(R.id.greenZones);
        TextView restaurants = (TextView)findViewById(R.id.restaurants);
        TextView council = (TextView)findViewById(R.id.council);

        // Set a click listener on that View
        sightseeing.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sightseeingIntent = new Intent(MainActivity.this, SightseeingActivity.class);
                startActivity(sightseeingIntent);
            }
        });

        // Set a click listener on that View
        greenZones.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent greenZonesIntent = new Intent(MainActivity.this, GreenZonesActivity.class);
                startActivity(greenZonesIntent);
            }
        });

        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        // Set a click listener on that View
        council.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent councilIntent = new Intent(MainActivity.this, CouncilActivity.class);
                startActivity(councilIntent);
            }
        });

    }
}
