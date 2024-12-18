package Strategy;

import Models.*;

import java.util.List;

public class RandomSpotAssignmentStrategy implements SpotAssignmentStrategy{

    @Override
    public ParkingSpot assignSpot(VehicleType vehicleType, Gate gate, List<ParkingSpot> parkingSpotList) {
        for(ParkingSpot parkingSpot: parkingSpotList){
            if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) && parkingSpot.getSupportedVehicleType().contains(vehicleType)) {
                return parkingSpot;
            }
        }
        return null;
    }
}
