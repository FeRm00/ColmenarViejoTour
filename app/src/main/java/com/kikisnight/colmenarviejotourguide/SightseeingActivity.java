package com.kikisnight.colmenarviejotourguide;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;


public class SightseeingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        // Create a list of tour elements
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getResources().getString(R.string.basilica),
                getResources().getString(R.string.basilica_dir), R.drawable.basilica));
        tours.add(new Tour(getResources().getString(R.string.hermita_de_remedios),
                getResources().getString(R.string.hermita_de_remedios_dir), R.drawable.ermita_de_remedios));
        tours.add(new Tour(getResources().getString(R.string.puente_del_grajal),
                getResources().getString(R.string.puente_del_grajal_dir), R.drawable.puente_del_grajal));
        tours.add(new Tour(getResources().getString(R.string.plaza_ayuntamiento),
                getResources().getString(R.string.plaza_ayuntamiento_dir), R.drawable.plaza_ayuntamiento));
        tours.add(new Tour(getResources().getString(R.string.museo_geologico),
                getResources().getString(R.string.museo_geologico_dir), R.drawable.museo_geologico));
        tours.add(new Tour(getResources().getString(R.string.estacion_renfe),
                getResources().getString(R.string.estacion_renfe_dir), R.drawable.estacion_renfe));
        tours.add(new Tour(getResources().getString(R.string.plaza_de_toros),
                getResources().getString(R.string.plaza_de_toros_dir), R.drawable.plaza_de_toros));

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
