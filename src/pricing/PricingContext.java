package pricing;

import model.Ride;
import pricing.strategy.PricingStrategy;

import java.util.ArrayList;
import java.util.List;

public class PricingContext {
    private List<PricingStrategy> strategies = new ArrayList<>();

    public void addStrategy(PricingStrategy strategy) {
        strategies.add(strategy);
    }

    public void removeStrategy(PricingStrategy strategy) {
        strategies.remove(strategy);
    }

    public double calculateTotalPrice(Ride ride) {
        double totalPrice = 0;
        for (PricingStrategy strategy : strategies) {
            totalPrice += strategy.calculatePrice(ride);
        }
        return totalPrice;
    }
}
