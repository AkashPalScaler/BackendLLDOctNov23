package ParkingLot.models;

public class Vehicle {
    private String vehicleNo;
    private String ownerName;
    private VehicleType vehicleType;
    private String OwnerNo;


    public String getOwnerNo() {
        return OwnerNo;
    }

    public void setOwnerNo(String ownerNo) {
        OwnerNo = ownerNo;
    }


    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
