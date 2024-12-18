package Services;

import Models.*;
import Repository.TicketRepository;
import Strategy.SpotAssignmentStrategy;
import Exception.NoParkingSpotFoundException;

import java.util.Date;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;
    private ParkingSpotService parkingSpotService;
    private TicketRepository ticketRepository;
    private ParkingLotService parkingLotService;
    public Ticket generateTicket(String vehicleNumber, VehicleType vehicleType, Long gateId) throws NoParkingSpotFoundException {
        //Flow:
        //1. Get vehicle from DB using vehicleNumber
        //2. If vehicle is not found, register vehicle
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
        if(vehicle == null){
            throw new NoParkingSpotFoundException("No Parking Spot Available");
        }

        Gate gate = gateService.getGate(gateId);
        //3. Assign parking spot
        //todo implement assign spot
        ParkingSpot parkingSpot = parkingLotService.getParkingSpot(vehicle,gate);
        //4. update parking spot as occupied
         parkingSpot = parkingSpotService.assignParkingSpot(parkingSpot);
        //5. Generate ticket
        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime((new Date()));
        //save ticket
        ticketRepository.save(ticket);
        return ticket;
    }
}