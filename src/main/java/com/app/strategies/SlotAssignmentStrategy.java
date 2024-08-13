package com.app.strategies;

import com.app.models.ParkingLot;
import com.app.models.ParkingSlot;
import com.app.models.VehicleType;

public interface SlotAssignmentStrategy {

    public ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
