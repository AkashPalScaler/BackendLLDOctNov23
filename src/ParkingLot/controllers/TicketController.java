package ParkingLot.controllers;

import ParkingLot.DTOs.IssueTicketRequestDTO;
import ParkingLot.DTOs.IssueTicketResponseDTO;
import ParkingLot.models.Gate;
import ParkingLot.models.Operator;
import ParkingLot.models.Ticket;

public class TicketController {
    public static IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        requestDTO.getGate();
        return new IssueTicketResponseDTO();
    }
}
