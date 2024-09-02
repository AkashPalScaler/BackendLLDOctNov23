package ParkingLot.repositories;

import ParkingLot.models.*;

import java.util.ArrayList;
import java.util.Optional;
import java.util.*;

public class GateRepository {
    TreeMap<Integer, Gate> gates;
    int previousId = 0;

    public Gate save(Gate gate){
        previousId += 1;
        gate.setId(previousId);
        gates.put(previousId, gate);
        return gate;
    }
    public Optional<Gate> findGateByID(long gate_id){
        // select * gate where gate_id='gate_id'
        // Getting gate data from a sql query -> ORM(query) -> Gate Object
        if(gate_id == 123L){
            Gate gate =  new Gate();
            gate.setGateNumber("12A");
            gate.setGateStatus(GateStatusType.OPEN);
            gate.setGateType(GateType.ENTRY);
            ParkingLot parkingLot = new ParkingLot();
            List<Gate> entrygates = new ArrayList<>();
            entrygates.add(gate);
            parkingLot.setEntryGates(entrygates);
            parkingLot.setName("Lodha");
            parkingLot.setExitGates(entrygates);
            parkingLot.setParkingSlotAllocationStrategyType(ParkingSlotAllocationStrategyType.RANDOM);
            parkingLot.setSupportedVehicleTypes(null);
            parkingLot.setId(1234123L);
            ParkingFloor parkingFloor = new ParkingFloor();
            parkingFloor.setFloorNumber("1");
            parkingFloor.setParkingFloorStatus(ParkingFloorStatusType.OPEN);
            parkingFloor.setVehicleTypes(null);
            ParkingSlot parkingSlot = new ParkingSlot();
            parkingSlot.setParkingSlotStatus(ParkingSlotStatus.EMPTY);
            parkingSlot.setSlotNumber("10A");
            parkingSlot.setVehicleType(VehicleType.CAR);
            List<ParkingSlot> parkingSlots = new ArrayList<>();
            parkingSlots.add(parkingSlot);
            parkingFloor.setParkingSlots(parkingSlots);
            List<ParkingFloor> parkingFloorList = new ArrayList<>();
            parkingFloorList.add(parkingFloor);

            parkingLot.setParkingFloorList(parkingFloorList);
            gate.setParkingLot(parkingLot);
            return Optional.of(gate);
        }
        return Optional.empty();
    }
}
