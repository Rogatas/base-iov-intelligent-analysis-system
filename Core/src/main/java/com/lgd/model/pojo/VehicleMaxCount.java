package com.lgd.model.pojo;

public class VehicleMaxCount {
    private Integer id;

    private String innerId;

    private Integer maxSpeed;

    private Integer maxMileage;

    private Integer maxEngineSpeed;

    private Integer maxEngineTem;

    private Integer maxEngineLoad;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInnerId() {
        return innerId;
    }

    public void setInnerId(String innerId) {
        this.innerId = innerId == null ? null : innerId.trim();
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getMaxMileage() {
        return maxMileage;
    }

    public void setMaxMileage(Integer maxMileage) {
        this.maxMileage = maxMileage;
    }

    public Integer getMaxEngineSpeed() {
        return maxEngineSpeed;
    }

    public void setMaxEngineSpeed(Integer maxEngineSpeed) {
        this.maxEngineSpeed = maxEngineSpeed;
    }

    public Integer getMaxEngineTem() {
        return maxEngineTem;
    }

    public void setMaxEngineTem(Integer maxEngineTem) {
        this.maxEngineTem = maxEngineTem;
    }

    public Integer getMaxEngineLoad() {
        return maxEngineLoad;
    }

    public void setMaxEngineLoad(Integer maxEngineLoad) {
        this.maxEngineLoad = maxEngineLoad;
    }
}