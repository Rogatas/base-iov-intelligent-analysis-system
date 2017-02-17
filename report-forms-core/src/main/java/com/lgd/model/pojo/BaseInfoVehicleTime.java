package com.lgd.model.pojo;

public class BaseInfoVehicleTime {
    private Integer id;

    private String storageTime;

    private Double minOilWear;

    private Double averageOilWear;

    private Double maxOilWear;

    private Double minIntakeTem;

    private Double averageIntakeTem;

    private Double maxIntakeTem;

    private Double minAirFlow;

    private Double averageAirFlow;

    private Double maxAirFlow;

    private Double minBatteryVoltage;

    private Double averageBatteryVoltage;

    private Double maxBatteryVoltage;

    private Double minCoolantTem;

    private Double averageCoolantTem;

    private Double maxCoolantTem;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStorageTime() {
        return storageTime;
    }

    public void setStorageTime(String storageTime) {
        this.storageTime = storageTime == null ? null : storageTime.trim();
    }

    public Double getMinOilWear() {
        return minOilWear;
    }

    public void setMinOilWear(Double minOilWear) {
        this.minOilWear = minOilWear;
    }

    public Double getAverageOilWear() {
        return averageOilWear;
    }

    public void setAverageOilWear(Double averageOilWear) {
        this.averageOilWear = averageOilWear;
    }

    public Double getMaxOilWear() {
        return maxOilWear;
    }

    public void setMaxOilWear(Double maxOilWear) {
        this.maxOilWear = maxOilWear;
    }

    public Double getMinIntakeTem() {
        return minIntakeTem;
    }

    public void setMinIntakeTem(Double minIntakeTem) {
        this.minIntakeTem = minIntakeTem;
    }

    public Double getAverageIntakeTem() {
        return averageIntakeTem;
    }

    public void setAverageIntakeTem(Double averageIntakeTem) {
        this.averageIntakeTem = averageIntakeTem;
    }

    public Double getMaxIntakeTem() {
        return maxIntakeTem;
    }

    public void setMaxIntakeTem(Double maxIntakeTem) {
        this.maxIntakeTem = maxIntakeTem;
    }

    public Double getMinAirFlow() {
        return minAirFlow;
    }

    public void setMinAirFlow(Double minAirFlow) {
        this.minAirFlow = minAirFlow;
    }

    public Double getAverageAirFlow() {
        return averageAirFlow;
    }

    public void setAverageAirFlow(Double averageAirFlow) {
        this.averageAirFlow = averageAirFlow;
    }

    public Double getMaxAirFlow() {
        return maxAirFlow;
    }

    public void setMaxAirFlow(Double maxAirFlow) {
        this.maxAirFlow = maxAirFlow;
    }

    public Double getMinBatteryVoltage() {
        return minBatteryVoltage;
    }

    public void setMinBatteryVoltage(Double minBatteryVoltage) {
        this.minBatteryVoltage = minBatteryVoltage;
    }

    public Double getAverageBatteryVoltage() {
        return averageBatteryVoltage;
    }

    public void setAverageBatteryVoltage(Double averageBatteryVoltage) {
        this.averageBatteryVoltage = averageBatteryVoltage;
    }

    public Double getMaxBatteryVoltage() {
        return maxBatteryVoltage;
    }

    public void setMaxBatteryVoltage(Double maxBatteryVoltage) {
        this.maxBatteryVoltage = maxBatteryVoltage;
    }

    public Double getMinCoolantTem() {
        return minCoolantTem;
    }

    public void setMinCoolantTem(Double minCoolantTem) {
        this.minCoolantTem = minCoolantTem;
    }

    public Double getAverageCoolantTem() {
        return averageCoolantTem;
    }

    public void setAverageCoolantTem(Double averageCoolantTem) {
        this.averageCoolantTem = averageCoolantTem;
    }

    public Double getMaxCoolantTem() {
        return maxCoolantTem;
    }

    public void setMaxCoolantTem(Double maxCoolantTem) {
        this.maxCoolantTem = maxCoolantTem;
    }
}