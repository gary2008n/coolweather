package com.garyweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gsl on 2017/11/7.
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