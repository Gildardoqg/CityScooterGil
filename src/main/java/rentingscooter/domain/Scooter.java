package rentingscooter.domain;

import java.util.Date;

public class Scooter extends Vehicle{

    float engineCapacity;
    private double pricePerHour;
    private Date lastMaintenanceDate;
    private PickupPoint pickupPoint;

    public Scooter(int idVehicle, String brand, String model, String color, int paxCapacity, String reference, String plate, boolean availableForRent, float engineCapacity, double pricePerHour, Date lastMaintenanceDate, PickupPoint pickupPoint) {
        super(idVehicle, brand, model, color, paxCapacity, reference, plate, availableForRent);
        this.engineCapacity = engineCapacity;
        this.pricePerHour = pricePerHour;
        this.lastMaintenanceDate = lastMaintenanceDate;
        this.pickupPoint = pickupPoint;
    }

    public Scooter() {
        super();
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Date getLastMaintenanceDate() {
        return lastMaintenanceDate;
    }

    public void setLastMaintenanceDate(Date lastMaintenanceDate) {
        this.lastMaintenanceDate = lastMaintenanceDate;
    }

    public PickupPoint getPickupPoint() {
        return pickupPoint;
    }

    public void setPickupPoint(PickupPoint pickupPoint) {
        this.pickupPoint = pickupPoint;
    }

    @Override
    public String toString() {
        return "Scooter{" +
                "engineCapacity=" + engineCapacity +
                ", pricePerHour=" + pricePerHour +
                ", lastMaintenanceDate=" + lastMaintenanceDate +
                ", pickupPoint=" + pickupPoint +
                '}';
    }
}
