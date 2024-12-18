package Controller;

import DTO.GenerateTicketResponseDTO;
import DTO.ResponseStatus;
import Models.Gate;
import Models.Operator;

import Models.Ticket;
import Models.Vehicle;
import DTO.GenerateTicketRequestDTO;
import Services.TicketService;
import Exception.NoParkingSpotFoundException;

import java.util.Date;

public class TicketController {
    private TicketService ticketService;
    // DTO -> data transfer object used to transfer data from client to system
    // if we add remove models from the input, current clients will start failing.
    // we should not expose the model details to client because of privacy.
    // The solution to this is : Data transfer Objects (DTO).
    // Filter to show only required information
    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO generateTicketRequestDTO){
        try {
            Ticket ticket;
            ticket = ticketService.generateTicket(
                    generateTicketRequestDTO.getVehicleNumber(),
                    generateTicketRequestDTO.getVehicleType(),
                    generateTicketRequestDTO.getGateId());
            GenerateTicketResponseDTO generateTicketResponseDTO = new GenerateTicketResponseDTO();
            generateTicketResponseDTO.setTicket(ticket);
            generateTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            return generateTicketResponseDTO;
        } catch (NoParkingSpotFoundException e) {
            GenerateTicketResponseDTO generateTicketResponseDTO = new GenerateTicketResponseDTO();
            generateTicketResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
            generateTicketResponseDTO.setFailureMessage(e.getMessage());
            return generateTicketResponseDTO;
        }
    }
}
