package cn.zhengweiyi.weiyiweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {

    private int id;                 //市ID

    private String cityName;        //市名

    private int cityCode;           //市代号

    private int provinceId;         //当前市所属省的ID

    public int getId(){
        return id;
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

    public String getCityName() {
        return cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

}
