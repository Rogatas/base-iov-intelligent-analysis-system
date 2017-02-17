package com.lgd.model.pojo;

public class VehicleEngineSpeedRange {
    private Integer id;

    private String vehicleEngineSpeed;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleEngineSpeed() {
        return vehicleEngineSpeed;
    }

    public void setVehicleEngineSpeed(String vehicleEngineSpeed) {
        this.vehicleEngineSpeed = vehicleEngineSpeed == null ? null : vehicleEngineSpeed.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}