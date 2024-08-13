package com.app.models;

public class Vehicle extends BaseModel {

    private String licensePlate;
    private String ownerName;
    private VehicleType vehicleType;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getWnerName() {
        return ownerName;
    }

    public void setWnerName(String wnerName) {
        this.ownerName = wnerName;
    }
}
