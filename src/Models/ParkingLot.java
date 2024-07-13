package Models;

import java.util.List;

public class ParkingLot extends BaseEntity{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private String address;
    private int ID;
    private String name;
    private ParkingLotstatus parkingLotstatus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParkingLotstatus getParkingLotstatus() {
        return parkingLotstatus;
    }

    public void setParkingLotstatus(ParkingLotstatus parkingLotstatus) {
        this.parkingLotstatus = parkingLotstatus;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
