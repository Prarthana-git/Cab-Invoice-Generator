package com.cabservice;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CabInvoiceTest {
    //declare object globally no need to declare in each method
    CabInvoice cabinvoice=null;
    @Before
    public void setUp() throws Exception {
        cabinvoice = new CabInvoice();
    }

    @Test
    public void givenreturn_type_shouldreturn_fare() {
        double distance=2.0;
        int time=5;
        double fare= cabinvoice.calculateFare(distance,time);
        Assert.assertEquals(25,fare,0.0);

    }
    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double totalFare = cabinvoice.calculateFare(distance, time);
        Assert.assertEquals(5,totalFare,0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare()
    {
        Ride[] rides={new Ride(2.0,5),
                new Ride(0.1,1)
        };
        InvoiceSummary summary=cabinvoice.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary=new InvoiceSummary(2,1);
        Assert.assertEquals(expectedInvoiceSummary,summary);
    }
}
