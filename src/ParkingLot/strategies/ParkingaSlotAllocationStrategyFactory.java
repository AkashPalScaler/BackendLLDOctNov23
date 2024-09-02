package ParkingLot.strategies;

import ParkingLot.models.ParkingSlotAllocationStrategyType;

public class ParkingaSlotAllocationStrategyFactory {
    public static ParkingSlotAllocationStrategy getStrategy(ParkingSlotAllocationStrategyType parkingSlotAllocationStrategyType){
        if(parkingSlotAllocationStrategyType.equals(ParkingSlotAllocationStrategyType.RANDOM)){
            return new RandomParkingSlotAllocationStrategy();
        }
        return null;
    }
}
