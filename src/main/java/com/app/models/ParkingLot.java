package com.app.models;

import java.util.List;

public class ParkingLot extends BaseModel{

    private String name;
    private List<ParkingFloor> floors ;
    private ParkingLotStatus parkingLotStatus;
    private List<Gate> entryGates;
    private List<Gate> exitGates;

    // vehicle type
    private List<SupportedVehicleType> vehicleTypesCapacities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public List<SupportedVehicleType> getVehicleTypesCapacities() {
        return vehicleTypesCapacities;
    }

    public void setVehicleTypesCapacities(List<SupportedVehicleType> vehicleTypesCapacities) {
        this.vehicleTypesCapacities = vehicleTypesCapacities;
    }
}
