package com.cabservice;

public class InvoiceSummary {

    private final int numOfRides;
    private final double totalfare;
    private final double averagefare;

    public InvoiceSummary(int numOfRides, double totalfare)
    {
        this.numOfRides=numOfRides;
        this.totalfare=totalfare;
        this.averagefare=this.totalfare/this.numOfRides;
    }
}
