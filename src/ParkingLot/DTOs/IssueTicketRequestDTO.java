package ParkingLot.DTOs;

import ParkingLot.models.Gate;
import ParkingLot.models.Operator;
import ParkingLot.models.VehicleType;

public class IssueTicketRequestDTO {
    String VehicleNo;
    String CustomerNo;
    String customerName;
    long gate_id;
    VehicleType vehicleType;

    public String getVehicleNo() {
        return VehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        VehicleNo = vehicleNo;
    }

    public String getCustomerNo() {
        return CustomerNo;
    }

    public void setCustomerNo(String customerNo) {
        CustomerNo = customerNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getGate_id() {
        return gate_id;
    }

    public void setGate_id(long gate_id) {
        this.gate_id = gate_id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
