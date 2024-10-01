package dto;

public class RideResponseDTO {
    private double totalPrice;

    public RideResponseDTO(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
