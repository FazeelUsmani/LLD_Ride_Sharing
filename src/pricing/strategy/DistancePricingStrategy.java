package pricing.strategy;

import model.Ride;

public class DistancePricingStrategy implements PricingStrategy {
    private static final double RATE_PER_KM = 1.5;

    @Override
    public double calculatePrice(Ride ride) {
        return ride.getDistance() * RATE_PER_KM;
    }
}
