package Services;

import Models.Gate;
import Models.ParkingSpot;
import Models.Vehicle;
import Repository.ParkingLotRepository;
import Strategy.SpotAssignmentStrategy;

import java.util.List;

public class ParkingLotService {
    private SpotAssignmentStrategy spotAssignmentStrategy;
    private ParkingLotRepository parkingLotRepository;

    public ParkingLotService(SpotAssignmentStrategy spotAssignmentStrategy){
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    public ParkingLotService(ParkingLotRepository parkingLotRepository,SpotAssignmentStrategy spotAssignmentStrategy){
        this.spotAssignmentStrategy = spotAssignmentStrategy;
        this.parkingLotRepository = parkingLotRepository;
    }
    public ParkingSpot getParkingSpot(Vehicle vehicle, Gate gate){
        List<ParkingSpot> parkingSpotList = parkingLotRepository.getAllParkingSpots();
        return spotAssignmentStrategy.assignSpot(vehicle.getVehicleType(),gate,parkingSpotList);
    }
}
