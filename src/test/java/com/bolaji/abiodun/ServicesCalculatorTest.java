package com.bolaji.abiodun;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class ServicesCalculatorTest {


    //Should Charge 27.50 service charge for vaccine
    @Test
    public void calculateServicesPriceTest() {

        List<Service> serviceList = asList(Service.DIAGNOSIS, Service.BLOODTEST, Service.VACCINE, Service.VACCINE, Service.XRAY);
        double actualResult = ServicesCalculator.calculateServicesPrice(serviceList);
        double expectedResult = 345.50;
        assert (actualResult == expectedResult);

    }

}
