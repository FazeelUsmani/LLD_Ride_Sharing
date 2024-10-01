import dto.RideRequestDTO;
import dto.RideResponseDTO;
import interfaces.PricingService;
import services.PricingServiceImpl;

public class Main {
    public static void main(String[] args) {
        PricingService pricingService = new PricingServiceImpl();

        // Create a ride request DTO
        RideRequestDTO rideRequest = new RideRequestDTO(2, 8, true, 20);

        // Calculate the price
        RideResponseDTO rideResponse = pricingService.calculatePrice(rideRequest);
        System.out.println("Total Price: " + rideResponse.getTotalPrice());
    }
}
