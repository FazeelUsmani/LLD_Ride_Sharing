package services;

import dto.RideRequestDTO;
import dto.RideResponseDTO;
import model.Ride;
import pricing.PricingModule;
import pricing.strategy.DistancePricingStrategy;
import pricing.strategy.TimeOfDayPricingStrategy;
import pricing.strategy.DemandPricingStrategy;
import interfaces.PricingService;

public class PricingServiceImpl implements PricingService {
    private PricingModule pricingModule;

    public PricingServiceImpl() {
        pricingModule = new PricingModule();
        pricingModule.addPricingStrategy(new DistancePricingStrategy());
        pricingModule.addPricingStrategy(new TimeOfDayPricingStrategy());
        pricingModule.addPricingStrategy(new DemandPricingStrategy());
    }

    @Override
    public RideResponseDTO calculatePrice(RideRequestDTO rideRequest) {
        Ride ride = new Ride(
                rideRequest.getDistance(),
                rideRequest.getTimeOfDay(),
                rideRequest.isHighDemand(),
                rideRequest.getBasePrice()
        );
        double totalPrice = pricingModule.calculatePrice(ride);
        return new RideResponseDTO(totalPrice);
    }
}
