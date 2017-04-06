package com.kenshin.windystreet.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kenshin on 2017/4/4.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
