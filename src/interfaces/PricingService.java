package interfaces;

import dto.RideRequestDTO;
import dto.RideResponseDTO;

public interface PricingService {
    RideResponseDTO calculatePrice(RideRequestDTO rideRequest);
}
