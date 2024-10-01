package pricing.strategy;

import model.Ride;

public interface PricingStrategy {
    double calculatePrice(Ride ride);
}
