package dto;

public class RideRequestDTO {
    private double distance;
    private int timeOfDay;
    private boolean highDemand;
    private double basePrice;

    public RideRequestDTO(double distance, int timeOfDay, boolean highDemand, double basePrice) {
        this.distance = distance;
        this.timeOfDay = timeOfDay;
        this.highDemand = highDemand;
        this.basePrice = basePrice;
    }

    public double getDistance() {
        return distance;
    }

    public int getTimeOfDay() {
        return timeOfDay;
    }

    public boolean isHighDemand() {
        return highDemand;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
