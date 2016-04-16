package com.lgd.model.pojo;

public class VehicleEngineLoadRange {
    private Integer id;

    private String vehicleEngineLoad;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleEngineLoad() {
        return vehicleEngineLoad;
    }

    public void setVehicleEngineLoad(String vehicleEngineLoad) {
        this.vehicleEngineLoad = vehicleEngineLoad == null ? null : vehicleEngineLoad.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}