package com.cabservice;

public class CabInvoice {

    private static final double MINIMUM_COST_PER_KM = 10;
    private static final int COST_PER_TIME = 1;
    private double MINIMUM_Fare=5;

    public double calculateFare(double distance, int time) {
        double totalfare = distance * MINIMUM_COST_PER_KM + time * COST_PER_TIME;
        return Math.max(totalfare,MINIMUM_Fare);
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalfare=0;
        for(Ride ride:rides)
        {
            totalfare+=this.calculateFare(ride.distance,ride.time);
        }
        return new InvoiceSummary(rides.length, totalfare);
    }
}
