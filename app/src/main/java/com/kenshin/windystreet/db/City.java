package com.kenshin.windystreet.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Kenshin on 2017/4/3.
 */

public class City extends DataSupport {
    private int id; //编号

    private String cityName; //城市名称

    private int cityCode;  //城市代号

    private int provinceId;  //所属省的代号

    public int getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
