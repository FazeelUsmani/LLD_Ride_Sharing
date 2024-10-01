package test;

import dto.RideRequestDTO;
import dto.RideResponseDTO;
import interfaces.PricingService;
import services.PricingServiceImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PricingModuleTest {
    @Test
    public void testCalculatePrice() {
        PricingService pricingService = new PricingServiceImpl();

        // Create a ride request DTO
        RideRequestDTO rideRequest = new RideRequestDTO(10, 8, true, 20);

        // Calculate the price
        RideResponseDTO rideResponse = pricingService.calculatePrice(rideRequest);
        assertEquals(70.0, rideResponse.getTotalPrice(), 1.0);
    }
}
