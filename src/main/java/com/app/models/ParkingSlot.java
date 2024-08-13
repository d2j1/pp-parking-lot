package com.app.models;
import java.util.List;

public class ParkingSlot extends BaseModel{
    private String slotNumber;
    private ParkingSlotStatus parkingSlotStatus;
    private List<SupportedVehicleType> supportedVehicleTypeList;
    private ParkingFloor parkingFloor;

    public ParkingSlot() {
    }

    public ParkingSlot(String slotNumber, ParkingSlotStatus parkingSlotStatus, List<SupportedVehicleType> supportedVehicleTypeList) {
        this.slotNumber = slotNumber;
        this.parkingSlotStatus = parkingSlotStatus;
        this.supportedVehicleTypeList = supportedVehicleTypeList;
    }

    public String getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(String slotNumber) {
        this.slotNumber = slotNumber;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public List<SupportedVehicleType> getSupportedVehicleTypeList() {
        return supportedVehicleTypeList;
    }

    public void setSupportedVehicleTypeList(List<SupportedVehicleType> supportedVehicleTypeList) {
        this.supportedVehicleTypeList = supportedVehicleTypeList;
    }
}
