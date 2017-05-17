package com.coolweather.android.gson;

/**
 * description：
 * author： GYY on 2017/5/15 18:27.
 * mail：gyy_Android@163.com
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
