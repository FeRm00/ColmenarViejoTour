package com.kikisnight.colmenarviejotourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * {@link TourAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Tour} objects.
 */

public class TourAdapter extends ArrayAdapter<Tour> {

    public TourAdapter(Context context, ArrayList<Tour> tours) {
        super(context, 0, tours);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Tour} object located at this position in the list
        Tour currentTour = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID tittle_text_view.
        TextView tittleTextView = (TextView) listItemView.findViewById(R.id.tittle_text_view);

        // Get the Tittle from the currentTour object and set this text on
        // the Tittle TextView.
        tittleTextView.setText(currentTour.getTextTittlePlace());

        // Find the TextView in the list_item.xml layout with the ID location_text_view.
        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_text_view);

        // Get the location from the currentTour object and set this text on
        // the location TextView.
        locationTextView.setText(currentTour.getTextLocationPlace());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentTour.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentTour.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);

        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);

        }

        // Return the whole list item layout (containing 2 TextViews and 1 ImageView) so that it
        // can be shown in the ListView.
        return listItemView;


    }

}
