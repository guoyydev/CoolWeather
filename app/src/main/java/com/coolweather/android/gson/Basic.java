package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * description：
 * author： GYY on 2017/5/15 18:18.
 * mail：gyy_Android@163.com
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
