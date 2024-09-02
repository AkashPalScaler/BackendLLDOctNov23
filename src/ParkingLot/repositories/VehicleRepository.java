package ParkingLot.repositories;

import ParkingLot.models.Vehicle;
import ParkingLot.models.VehicleType;

import java.util.Optional;

public class VehicleRepository {
    public Optional<Vehicle> findByVehicleNo(String vehicleNo){
        //SQL query -> ORM -> To fetch db record
        return Optional.empty();
    }

    public Vehicle save(String vehicleNo, String ownerName, VehicleType vehicleType, String ownerNo){
        //SQL query -> ORM -> To create db record


        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNo(vehicleNo);
        vehicle.setVehicleType(vehicleType);
        vehicle.setOwnerName(ownerName);
        vehicle.setOwnerNo(ownerNo);
        return vehicle;
    }
}
