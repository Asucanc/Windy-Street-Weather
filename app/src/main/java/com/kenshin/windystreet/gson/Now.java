package com.kenshin.windystreet.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Kenshin on 2017/4/4.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
