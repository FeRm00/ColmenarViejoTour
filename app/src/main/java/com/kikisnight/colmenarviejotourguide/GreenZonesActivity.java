package com.kikisnight.colmenarviejotourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class GreenZonesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of tour elements
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getResources().getString(R.string.cerro_san_pedro),
                getResources().getString(R.string.cerro_san_pedro_dir), R.drawable.cerro_san_pedro));
        tours.add(new Tour(getResources().getString(R.string.parque_lineal_magdalena),
                getResources().getString(R.string.parque_lineal_magdalena_dir), R.drawable.parque_lineal_magdalena));
        tours.add(new Tour(getResources().getString(R.string.parque_rodriguez_de_la_fuente),
                getResources().getString(R.string.parque_rodriguez_de_la_fuente_dir), R.drawable.parque_rodriguez_de_la_fuente));


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
