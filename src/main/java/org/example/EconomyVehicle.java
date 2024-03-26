package org.example;

public class EconomyVehicle extends VehicleAbstract {

        private boolean isHybrid;

        public EconomyVehicle(String brand, String model, String licensePlate, boolean isHybrid) {
            super(brand, model, licensePlate, 50); // Base price for economy
            this.isHybrid = isHybrid;
        }

        @Override
        public double calculateTotalRentalPrice(int rentalDays) {
            double total = baseRentalPrice * rentalDays;
            if (isHybrid) total += 10 * rentalDays;
            return total;
        }


        public boolean isHybrid() {
            return isHybrid;
        }

        public void setHybrid(boolean isHybrid) {
            this.isHybrid = isHybrid;
        }
    }

