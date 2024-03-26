package org.example;

public abstract class VehicleAbstract {
    protected String brand;
    protected String model;
    protected String licensePlate;
    protected double baseRentalPrice;

    public VehicleAbstract(String brand, String model, String licensePlate, double baseRentalPrice) {
        this.brand = brand;
        this.model = model;
        this.licensePlate = licensePlate;
        this.baseRentalPrice = baseRentalPrice;
    }
    /**
     * Abstract method to calculate the total rental price for the vehicle.
     *
     * @param rentalDays The number of days the vehicle is rented.
     * @return The total rental price for the specified period.
     */

    public abstract double calculateTotalRentalPrice(int rentalDays);

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getBaseRentalPrice() {
        return baseRentalPrice;
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setBaseRentalPrice(double baseRentalPrice) {
        this.baseRentalPrice = baseRentalPrice;
    }
}
