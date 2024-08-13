package com.app.models;

public class SupportedVehicleType {
    private VehicleType vehicleType;
    private int capacity;

    public SupportedVehicleType(VehicleType vehicleType, int capacity) {
        this.vehicleType = vehicleType;
        this.capacity = capacity;
    }

    public SupportedVehicleType() {
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
