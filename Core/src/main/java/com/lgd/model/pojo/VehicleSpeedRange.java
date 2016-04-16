package com.lgd.model.pojo;

public class VehicleSpeedRange {
    private Integer id;

    private String vehicleSpeed;

    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(String vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed == null ? null : vehicleSpeed.trim();
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}