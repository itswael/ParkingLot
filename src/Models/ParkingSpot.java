package Models;

import java.util.List;

public class ParkingSpot extends BaseEntity{
    private List<VehicleType> supportedVehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingFloor parkingFloor;
    private int number;

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
