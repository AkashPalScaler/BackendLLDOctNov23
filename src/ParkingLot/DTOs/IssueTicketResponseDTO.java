package ParkingLot.DTOs;

public class IssueTicketResponseDTO {
    long TicketID;
    Integer TicketNumber;
    String message;
    ResponseStatus status;


    public long getTicketID() {
        return TicketID;
    }

    public void setTicketID(long ticketID) {
        TicketID = ticketID;
    }

    public Integer getTicketNumber() {
        return TicketNumber;
    }

    public void setTicketNumber(Integer ticketNumber) {
        TicketNumber = ticketNumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }
}


//DB Configuration: - http://12i7531873.parking_db.rds.amazon.com, 5432, USERNAME, PASSWORD, DBNAME
