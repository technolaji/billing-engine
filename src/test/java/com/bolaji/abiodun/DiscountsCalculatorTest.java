package com.bolaji.abiodun;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class DiscountsCalculatorTest {


    @Test
    @Parameters({
            "1,0, 2",
            "80,50, 80",
            "55,54, 56",
            "123,123, 126",
    })
    public void isBetweenTest(int age, int minValueInclusive, int maxvalueInclusive) {


        boolean actualResult = DiscountsCalculator.isBetween(age, minValueInclusive, maxvalueInclusive);
        boolean expectedResult = true;

        assert(actualResult == expectedResult);
    }

    @Test
    @Parameters({
          "0,0.6f",
          "2,0.6f",
          "4,0.6f",

          "5, 0f",
          "35, 0f",
          "64, 0f",

          "65, 0.4f",
          "67, 0.4f",
          "70, 0.4f",

          "71, 0.1f",
          "96, 0.1f"
    })
    public void getDiscountsTest(int age, float discount){

        float actualResult = DiscountsCalculator.getDiscounts(age);
        float expectedResult = discount;

        assert(actualResult == expectedResult);
    }

    @Test
    public void calculateDiscounts(){
        Patient patient = new Patient(69, true);
        double actualResult = DiscountsCalculator.calculateDiscounts(patient, 1000);
        double expectedResult = 400;
        assert actualResult == expectedResult;


    }
}
