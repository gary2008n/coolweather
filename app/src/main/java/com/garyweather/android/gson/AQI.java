package com.garyweather.android.gson;

/**
 * Created by gsl on 2017/11/7.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
