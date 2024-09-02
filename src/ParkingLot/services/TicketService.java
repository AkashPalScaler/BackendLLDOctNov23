package ParkingLot.services;

import ParkingLot.models.*;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.strategies.ParkingSlotAllocationStrategy;
import ParkingLot.strategies.ParkingaSlotAllocationStrategyFactory;

import javax.swing.text.html.Option;
import java.util.Date;
import java.util.Optional;

public class TicketService {
    GateRepository gateRepository;
    VehicleRepository vehicleRepository;
    TicketRepository ticketRepository;
    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, TicketRepository ticketRepository){
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.ticketRepository = ticketRepository;
    }
    public Ticket issueTicket(String vehicleNo, long gate_id, String ownerName, String ownerNo, VehicleType vehicleType){
        //Think about all the data I need to create a ticket

        Ticket ticket = new Ticket();

        //Set the current time
        ticket.setEntryTime(new Date());


        //Fetching gate from DB
        Optional<Gate> gateOptional = gateRepository.findGateByID(gate_id);
        // gate can be null
        if(gateOptional.isEmpty()){
            throw new IllegalArgumentException("Gate doesn't exist");
        }

        Gate gate = gateOptional.get();

        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());


        //Fetching vehiclle from DB
        Optional<Vehicle> vehicleOptional = vehicleRepository.findByVehicleNo(vehicleNo);
        Vehicle vehicle;
        if(vehicleOptional.isEmpty()){
            vehicle = vehicleRepository.save(vehicleNo, ownerName, vehicleType, ownerNo);
        }else{
            vehicle = vehicleOptional.get();
        }

        ticket.setVehicle(vehicle);

        // GATE -> LOOP through all parking lots
        //and check if the gate id is present in the entryGates

        ticket.setParkingLot(gate.getParkingLot());

        ParkingSlotAllocationStrategy  strategy = ParkingaSlotAllocationStrategyFactory.getStrategy(gate.getParkingLot().getParkingSlotAllocationStrategyType());

        ParkingSlot parkingSlot = strategy.getAvailableSlot(vehicle.getVehicleType(), gate.getParkingLot());

        parkingSlot.setParkingSlotStatus(ParkingSlotStatus.FILLED);

        ticket.setParkingSlot(parkingSlot);

        return ticketRepository.save(ticket);
    }
}
