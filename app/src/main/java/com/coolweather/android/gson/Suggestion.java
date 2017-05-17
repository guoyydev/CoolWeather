package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * description：
 * author： GYY on 2017/5/15 18:33.
 * mail：gyy_Android@163.com
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
