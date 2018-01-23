package com.coolweather.android.gson;

/**
 * Created by ZHEN on 2018/1/23.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
