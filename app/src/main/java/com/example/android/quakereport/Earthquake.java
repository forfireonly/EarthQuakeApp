package com.example.android.quakereport;

public class Earthquake {
 private double mMagnitude;
 private String mPlace;
    private long mTimeInMilliseconds;
    private String murl;


  public Earthquake(double magnitude, String place, long  timeInMilliseconds, String url){
     mMagnitude = magnitude;
     mPlace = place;
     mTimeInMilliseconds = timeInMilliseconds;
     murl = url;

 }

    public double getmMagnitude() {
        return mMagnitude;
    }



    public String getmPlace() {
        return mPlace;
    }

    public long getmTimeInMilliseconds() { return mTimeInMilliseconds;}

    public String getMurl() {
        return murl;
    }
}
