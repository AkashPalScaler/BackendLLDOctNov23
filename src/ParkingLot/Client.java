package ParkingLot;

import ParkingLot.DTOs.IssueTicketRequestDTO;
import ParkingLot.DTOs.IssueTicketResponseDTO;
import ParkingLot.controllers.TicketController;
import ParkingLot.models.BaseClass;
import ParkingLot.models.ParkingLot;
import ParkingLot.models.VehicleType;
import ParkingLot.repositories.GateRepository;
import ParkingLot.repositories.TicketRepository;
import ParkingLot.repositories.VehicleRepository;
import ParkingLot.services.TicketService;

public class Client {
    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        TicketRepository ticketRepository = new TicketRepository();

        TicketService ticketService = new TicketService(
                gateRepository,
                vehicleRepository,
                ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setCustomerName("Akash");
        issueTicketRequestDTO.setCustomerNo("9889899321");
        issueTicketRequestDTO.setGate_id(123L);
        issueTicketRequestDTO.setVehicleType(VehicleType.CAR);
        issueTicketRequestDTO.setVehicleNo("123523873");


        IssueTicketResponseDTO issueTicketResponseDTO = ticketController.issueTicket(issueTicketRequestDTO);

        System.out.println(issueTicketResponseDTO.getTicketID());
        System.out.println(issueTicketResponseDTO.getTicketNumber());
        System.out.println(issueTicketResponseDTO.getMessage());
        System.out.println(issueTicketResponseDTO.getStatus());

    }
}
