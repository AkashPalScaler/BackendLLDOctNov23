package ParkingLot.models;

import java.util.Date;
import java.util.List;


public class ParkingLot extends BaseClass{
    String name;
    List<ParkingFloor> parkingFloorList;

    List<Gate> entryGates;
    List<Gate> exitGates;
    List<SupportedVehicleType> supportedVehicleTypes;
    ParkingSlotAllocationStrategyType parkingSlotAllocationStrategyType;

    public ParkingSlotAllocationStrategyType getParkingSlotAllocationStrategyType() {
        return parkingSlotAllocationStrategyType;
    }

    public void setParkingSlotAllocationStrategyType(ParkingSlotAllocationStrategyType parkingSlotAllocationStrategyType) {
        this.parkingSlotAllocationStrategyType = parkingSlotAllocationStrategyType;
    }

    public List<SupportedVehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<SupportedVehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    ParkingLotStatusType parkingLotStatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
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

    public ParkingLotStatusType getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatusType parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }
}
