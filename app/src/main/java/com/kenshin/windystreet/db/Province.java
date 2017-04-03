package com.kenshin.windystreet.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Kenshin on 2017/4/3.
 */

public class Province extends DataSupport {
//    编号
    private int id;
//    省名
    private String provinceName;
//    省代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
