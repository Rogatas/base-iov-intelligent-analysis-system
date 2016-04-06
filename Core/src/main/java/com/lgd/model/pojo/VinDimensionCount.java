package com.lgd.model.pojo;

public class VinDimensionCount {
    private Integer id;

    private String province;

    private Integer pv;

    private Integer uvCountry;

    private Integer uvOem;

    private Integer uvYear;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUvCountry() {
        return uvCountry;
    }

    public void setUvCountry(Integer uvCountry) {
        this.uvCountry = uvCountry;
    }

    public Integer getUvOem() {
        return uvOem;
    }

    public void setUvOem(Integer uvOem) {
        this.uvOem = uvOem;
    }

    public Integer getUvYear() {
        return uvYear;
    }

    public void setUvYear(Integer uvYear) {
        this.uvYear = uvYear;
    }
}