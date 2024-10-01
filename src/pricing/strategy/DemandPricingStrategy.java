package pricing.strategy;

import model.Ride;

public class DemandPricingStrategy implements PricingStrategy {
    private static final double HIGH_DEMAND_RATE = 1.5;
    private static final double LOW_DEMAND_RATE = 1.0;

    @Override
    public double calculatePrice(Ride ride) {
        double rate = ride.isHighDemand() ? HIGH_DEMAND_RATE : LOW_DEMAND_RATE;
        return ride.getBasePrice() * rate;
    }
}
