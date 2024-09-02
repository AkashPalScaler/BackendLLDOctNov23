package ParkingLot.repositories;

import ParkingLot.models.Ticket;

import java.util.TreeMap;

public class TicketRepository {
    // In memory db:
    TreeMap<Long, Ticket> tickets;
    Long previousId;
    public TicketRepository(){
        tickets = new TreeMap<>();
        previousId = 0l;
    }
    public Ticket save(Ticket ticket){
        previousId+=1;
        ticket.setId(previousId);
        ticket.setTicketNumber(12);
        tickets.put(previousId, ticket);
        return tickets.get(previousId);
    }
}
