package rentingscooter.domain;

import java.util.ArrayList;

public class PickupPoint {

    private int idPickupPoint;
    private String pointName;
    private String location;
    private boolean isActive;
    ArrayList<Scooter> scooters;

    public PickupPoint(int idPickupPoint, String pointName, String location, boolean isActive, ArrayList<Scooter> scooters) {
        this.idPickupPoint = idPickupPoint;
        this.pointName = pointName;
        this.location = location;
        this.isActive = isActive;
        this.scooters = scooters;
    }

    public PickupPoint(){
        super();
    }

    public int getIdPickupPoint() {
        return idPickupPoint;
    }

    public void setIdPickupPoint(int idPickupPoint) {
        this.idPickupPoint = idPickupPoint;
    }

    public String getPointName() {
        return pointName;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ArrayList<Scooter> getScooters() {
        return scooters;
    }

    public void setScooters(ArrayList<Scooter> scooters) {
        this.scooters = scooters;
    }

    @Override
    public String toString() {
        return "PickupPoint{" +
                "idPickupPoint=" + idPickupPoint +
                ", pointName='" + pointName + '\'' +
                ", location='" + location + '\'' +
                ", isActive=" + isActive +
                ", scooters=" + scooters +
                '}';
    }
}
