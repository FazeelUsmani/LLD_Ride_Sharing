package pricing.strategy;

import model.Ride;

public class TimeOfDayPricingStrategy implements PricingStrategy {
    private static final double PEAK_HOUR_RATE = 1.2;
    private static final double OFF_PEAK_HOUR_RATE = 1.0;

    @Override
    public double calculatePrice(Ride ride) {
        int hour = ride.getTimeOfDay();
        double rate = (hour >= 7 && hour <= 9) || (hour >= 17 && hour <= 19) ? PEAK_HOUR_RATE : OFF_PEAK_HOUR_RATE;
        return ride.getBasePrice() * rate;
    }
}
