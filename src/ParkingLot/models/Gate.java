package ParkingLot.models;

public class Gate extends BaseClass{
    private String gateNumber;
    private Operator operator;
    private GateType gateType;
    private GateStatusType gateStatus;
    private ParkingLot parkingLot;


    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatusType getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatusType gateStatus) {
        this.gateStatus = gateStatus;
    }
}
