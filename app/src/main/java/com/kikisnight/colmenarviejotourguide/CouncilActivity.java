package com.kikisnight.colmenarviejotourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CouncilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of tour elements
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getResources().getString(R.string.ayuntamiento),
                getResources().getString(R.string.ayuntamiento_dir), R.drawable.ayuntamiento));
        tours.add(new Tour(getResources().getString(R.string.centro_salud),
                getResources().getString(R.string.centro_salud_dir), R.drawable.centro_salud));
        tours.add(new Tour(getResources().getString(R.string.biblioteca_miguel_cervantes),
                getResources().getString(R.string.biblioteca_miguel_cervantes_dir), R.drawable.biblioteca_miguel_cervantes));
        tours.add(new Tour(getResources().getString(R.string.juzgados),
                getResources().getString(R.string.juzgados_dir), R.drawable.juzgados));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        TourAdapter adapter = new TourAdapter(this, tours);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // place_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link TourAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Tour} in the list.
        listView.setAdapter(adapter);

    }
}
