package com.kenshin.windystreet.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Kenshin on 2017/4/3.
 */

public class County extends DataSupport {
    private int id; //编号

    private String countyName; //县名

    private String weatherId; //对应的天气id

    private int cityId;  //所属市的id

    public void setId(int id) {
        this.id = id;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }
}
