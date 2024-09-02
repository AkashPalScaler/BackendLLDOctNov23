package ParkingLot.models;

import java.util.*;

public class ParkingFloor {
    private String floorNumber;
    private List<ParkingSlot> parkingSlots;
    private ParkingFloorStatusType parkingFloorStatus;
    private List<SupportedVehicleType> vehicleTypes;

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }

    public ParkingFloorStatusType getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatusType parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<SupportedVehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<SupportedVehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }
}
