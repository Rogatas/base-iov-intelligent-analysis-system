package com.lgd.model.pojo;

import java.util.Date;

public class VehicleDailyNum {
    private Integer id;

    private String vehicleId;

    private Date storageTime;

    private Integer vehicleIdNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId == null ? null : vehicleId.trim();
    }

    public Date getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(Date storageTime) {
        this.storageTime = storageTime;
    }

    public Integer getVehicleIdNum() {
        return vehicleIdNum;
    }

    public void setVehicleIdNum(Integer vehicleIdNum) {
        this.vehicleIdNum = vehicleIdNum;
    }
}