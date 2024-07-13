package Models;

import java.util.List;

public class ParkingFloor extends BaseEntity{
    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingFloorStatus parkingFloorStatus;

    public int getID() {
        return number;
    }

    public void setID(int ID) {
        this.number = ID;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ParkingFloorStatus getParkingFloorStatus() {
        return parkingFloorStatus;
    }

    public void setParkingFloorStatus(ParkingFloorStatus parkingFloorStatus) {
        this.parkingFloorStatus = parkingFloorStatus;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
