package ParkingLot.strategies;

import ParkingLot.models.*;

public class RandomParkingSlotAllocationStrategy implements  ParkingSlotAllocationStrategy{
    @Override
    public ParkingSlot getAvailableSlot( VehicleType vehicleType, ParkingLot parkingLot) {
            for(ParkingFloor floor : parkingLot.getParkingFloorList()){
                if(floor.getParkingFloorStatus().equals(ParkingFloorStatusType.OPEN)) {
                    for(ParkingSlot slot : floor.getParkingSlots()){
                        if(slot.getParkingSlotStatus() == ParkingSlotStatus.EMPTY && slot.getVehicleType().equals(vehicleType)){
                            return slot;
                        }
                    }
                }
            }
            return null;
    }
}
