package com.kikisnight.colmenarviejotourguide;

import android.widget.ImageView;

/**
 * {@link Tour} represents a place/location where  the user wants to see or visit.
 * It contains a the name of the place, a resume, and an image for that place.
 */
public class Tour {

    private String mTextTittlePlace;
    private String mTextLocationPlace;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //** Constant value that represents no image was provided for this item */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Tour (String textTittlePlace, String textLocationPlace, int imageResourceId) {

        mTextTittlePlace = textTittlePlace;
        mTextLocationPlace = textLocationPlace;
        mImageResourceId = imageResourceId;
    }

    public Tour (String textTittlePlace, String textLocationPlace) {

        mTextTittlePlace = textTittlePlace;
        mTextLocationPlace = textLocationPlace;
    }


    public String getTextTittlePlace () {
        return mTextTittlePlace;
    }

    public String getTextLocationPlace () {
        return mTextLocationPlace;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
