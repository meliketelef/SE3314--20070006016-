package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

    public class VehicleRentalTest {

        @Test
        public void testLuxuryVehicleBasePrice() {
            LuxuryVehicle luxuryVehicle = new LuxuryVehicle("Lamborghini", "Huracan", "LUX123", false, false);
            double totalRentalPrice = luxuryVehicle.calculateTotalRentalPrice(3); // Renting for 3 days
            assertEquals("The total rental price for the luxury vehicle without extras is incorrect.", 300.0, totalRentalPrice, 0.01);
        }

        @Test
        public void testLuxuryVehicleWithFeatures() {
            LuxuryVehicle luxuryVehicle = new LuxuryVehicle("Rolls Royce", "Phantom", "RR1234", true, true);
            double totalRentalPrice = luxuryVehicle.calculateTotalRentalPrice(2); // Renting for 2 days
            assertEquals("The total rental price for the luxury vehicle with GPS and leather seats is incorrect.", 340.0, totalRentalPrice, 0.01);
        }

        @Test
        public void testEconomyVehicleBasePrice() {
            EconomyVehicle economyVehicle = new EconomyVehicle("Toyota", "Corolla", "ECO123", false);
            double totalRentalPrice = economyVehicle.calculateTotalRentalPrice(5); // Renting for 5 days
            assertEquals("The total rental price for the economy vehicle without hybrid feature is incorrect.", 250.0, totalRentalPrice, 0.01);
        }

        @Test
        public void testEconomyVehicleWithHybridFeature() {
            EconomyVehicle economyVehicle = new EconomyVehicle("Honda", "Civic Hybrid", "HYB123", true);
            double totalRentalPrice = economyVehicle.calculateTotalRentalPrice(4); // Renting for 4 days
            assertEquals("The total rental price for the economy vehicle with hybrid feature is incorrect.", 240.0, totalRentalPrice, 0.01);
        }
    }
