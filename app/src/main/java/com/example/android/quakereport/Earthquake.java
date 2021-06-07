package com.example.android.quakereport;

public class Earthquake {
    private Double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;
    private String murl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude          is the magnitude (size) of the earthquake
     * @param location           is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     */
    public Earthquake(Double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        murl=url;
    }


    public Double getmagnitude() {

        return mMagnitude;
    }

    public String getlocation() {

        return mLocation;

    }


    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String geturl(){ return murl; }
}

