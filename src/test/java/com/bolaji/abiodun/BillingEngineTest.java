package com.bolaji.abiodun;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

public class BillingEngineTest {


    @Test
    public void checkInsuranceTest(){
        Patient patient = new Patient(66, true);
        List<Service> serviceList = asList(Service.DIAGNOSIS, Service.BLOODTEST, Service.VACCINE, Service.VACCINE, Service.XRAY);
        boolean actualResult = BillingEngine.checkInsurance(patient, serviceList);
        boolean expectedResult = true;
        assert actualResult == expectedResult;

    }

    @Test
    public void adjustForInsurance(){
        double totalPrice = 1000;
        double actualResult = BillingEngine.adjustForInsurance(totalPrice);
        double expectedResult = 988.30;
        assert actualResult == expectedResult;
    }


    @Test
    public void getBillTest(){
        List<Service> serviceList = asList(Service.DIAGNOSIS, Service.BLOODTEST, Service.VACCINE, Service.VACCINE, Service.XRAY);
        Patient patient = new Patient(66, true);
        double actualResult = BillingEngine.getBill(serviceList, patient);
        double expectedResult = 133.52;
        assert actualResult == expectedResult;
    }



}
