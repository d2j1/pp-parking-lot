package com.app.models;

import java.util.List;

public class ParkingFloor extends BaseModel{
    private String floorNumber;
    private List<ParkingSlot> parkingLots;
    private ParkingFloorStatus parkingFloorStatus;
    private List<SupportedVehicleType> vehicleTypes;

    public ParkingFloor() {
    }

    public ParkingFloor(String floorNumber, List<ParkingSlot> parkingLots, ParkingFloorStatus parkingFloorStatus, List<SupportedVehicleType> vehicleTypes) {
        this.floorNumber = floorNumber;
        this.parkingLots = parkingLots;
        this.parkingFloorStatus = parkingFloorStatus;
        this.vehicleTypes = vehicleTypes;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingLots() {
        return parkingLots;
    }

    public void setParkingLots(List<ParkingSlot> parkingLots) {
        this.parkingLots = parkingLots;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
