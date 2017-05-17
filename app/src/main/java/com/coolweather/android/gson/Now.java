package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * description：
 * author： GYY on 2017/5/15 18:28.
 * mail：gyy_Android@163.com
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
