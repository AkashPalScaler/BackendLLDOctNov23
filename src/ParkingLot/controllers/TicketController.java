package ParkingLot.controllers;

import ParkingLot.DTOs.IssueTicketRequestDTO;
import ParkingLot.DTOs.IssueTicketResponseDTO;
import ParkingLot.DTOs.ResponseStatus;
import ParkingLot.models.Gate;
import ParkingLot.models.Operator;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {
    TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        // Validations - DTO validations
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(
                    requestDTO.getVehicleNo(),
                    requestDTO.getGate_id(),
                    requestDTO.getCustomerName(),
                    requestDTO.getCustomerNo(),
                    requestDTO.getVehicleType()
            );

            responseDTO.setTicketID(ticket.getId());
            responseDTO.setTicketNumber(ticket.getTicketNumber());
            responseDTO.setStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("Successfully gernerated ticket");
        }catch(Exception e) {
            responseDTO.setStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(e.getMessage());
            System.out.println("Error : "+ e.getMessage());
        }
        return responseDTO;
    }
}
