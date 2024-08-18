package com.app.strategies;

import com.app.models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy {
    @Override
    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        for(ParkingFloor floor : parkingLot.getFloors()) {
            for(ParkingSlot slot : floor.getParkingSlots()){
                if(slot.getParkingSlotStatus().equals(ParkingSlotStatus.EMPTY) &&
                slot.getVehicleType().equals(vehicleType){
                    return slot;
                }
            }
        }
        return null;
        
    }
}
