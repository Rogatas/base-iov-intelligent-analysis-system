package com.lgd.model.pojo;

public class VehicleEngineTemRange {
    private Integer id;

    private String vehicleEngineTem;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleEngineTem() {
        return vehicleEngineTem;
    }

    public void setVehicleEngineTem(String vehicleEngineTem) {
        this.vehicleEngineTem = vehicleEngineTem == null ? null : vehicleEngineTem.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}