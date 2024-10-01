package pricing;

import model.Ride;

public class PricingModule {
    private PricingContext pricingContext;

    public PricingModule() {
        pricingContext = new PricingContext();
    }

    public void addPricingStrategy(pricing.strategy.PricingStrategy strategy) {
        pricingContext.addStrategy(strategy);
    }

    public void removePricingStrategy(pricing.strategy.PricingStrategy strategy) {
        pricingContext.removeStrategy(strategy);
    }

    public double calculatePrice(Ride ride) {
        return pricingContext.calculateTotalPrice(ride);
    }
}
