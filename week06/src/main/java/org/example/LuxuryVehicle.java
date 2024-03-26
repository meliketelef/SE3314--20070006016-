package org.example;

public class LuxuryVehicle extends VehicleAbstract{
    private boolean hasGPS;
    private boolean hasLeatherSeats;


    /**
     * Constructs a new LuxuryVehicle with the specified details.
     * @param brand The brand of the vehicle.
     * @param model The model of the vehicle.
     * @param licensePlate The license plate of the vehicle.
     * @param hasGPS Indicates if the vehicle has GPS.
     * @param hasLeatherSeats Indicates if the vehicle has leather seats.
     */

    public LuxuryVehicle(String brand, String model, String licensePlate, boolean hasGPS, boolean hasLeatherSeats) {
        super(brand, model, licensePlate, 100); // Base price for luxury
        this.hasGPS = hasGPS;
        this.hasLeatherSeats = hasLeatherSeats;
    }

    /**
     * Calculates the total rental price based on the rental period and additional features.
     *
     * @param rentalDays The number of days the vehicle is rented for.
     * @return The total rental price.
     */

    @Override
    public double calculateTotalRentalPrice(int rentalDays){
        double total = baseRentalPrice * rentalDays;
        if (hasGPS) total += 30 * rentalDays;
        if (hasLeatherSeats) total += 40* rentalDays;
        return total;
    }



    /**
     * Checks if this luxury vehicle has GPS.
     *
     * @return true if the vehicle has GPS, false otherwise.
     */
    public boolean hasGPS() {
        return hasGPS;
    }

    /**
     * Sets the GPS feature of this luxury vehicle.
     *
     * @param hasGPS A boolean value indicating if the vehicle has GPS.
     */
    public void setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    /**
     * Checks if this luxury vehicle has leather seats.
     *
     * @return true if the vehicle has leather seats, false otherwise.
     */
    public boolean hasLeatherSeats() {
        return hasLeatherSeats;
    }

    /**
     * Sets the leather seats feature of this luxury vehicle.
     *
     * @param hasLeatherSeats A boolean value indicating if the vehicle has leather seats.
     */
    public void setLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}





