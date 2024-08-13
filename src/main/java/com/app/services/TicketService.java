package com.app.services;

import com.app.models.Gate;
import com.app.models.Ticket;
import com.app.models.Vehicle;
import com.app.models.VehicleType;
import com.app.repository.GateRepository;
import com.app.repository.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(int id, String vehicleNo, String ownerName, VehicleType vehicleType){

//        Properly create the ticket object with required details
            Ticket ticket = new Ticket();
            ticket.setId(id);
            ticket.setEntryTime(new Date());

            Optional<Gate> gateOptional  = gateRepository.findGateById(id);

            if(gateOptional.isPresent()){
                Gate gate = gateOptional.get();
            }else{
                throw new IllegalArgumentException("Gate not found");
            }
            Gate gate = gateOptional.get();
            ticket.setGate(gate);
            ticket.setOperator(gate.getOperator());

            Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleNumber(vehicleNo);

        Vehicle vehicle=null;

            if(vehicleOptional.isPresent()){
                vehicle = vehicleOptional.get();


            }else{
               vehicle = new Vehicle();
               vehicle.setVehicleType(vehicleType);
               vehicle.setLicensePlate(vehicleNo);
               vehicle.setOwnerName(ownerName);

               vehicle = vehicleRepository.save(vehicle);
            }

            ticket.setVehicle(vehicle);

//         and assign a slot


        // return the data


        return null;
    }
}
