package com.bolaji.abiodun;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMImplementationSource;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class DiscountsTest {


    @Test
    @Parameters({
            "1,0, 2",
            "80,50, 80",
            "55,54, 56",
            "123,123, 126",
    })
    public void isBetweenTest(int age, int minValueInclusive, int maxvalueInclusive) {


        boolean actualResult = Discounts.isBetween(age, minValueInclusive, maxvalueInclusive);
        boolean expectedResult = true;

        assert(actualResult == expectedResult);
    }

    @Test
    @Parameters({
          "0,0.4f",
          "2,0.4f",
          "4,0.4f",

          "5, 0f",
          "35, 0f",
          "64, 0f",

          "65, 0.6f",
          "67, 0.6f",
          "70, 0.6f",

          "71, 0.9f",
          "96, 0.9f"
    })
    public void getDiscountsTest(int age, float discount){

        float actualResult = Discounts.getDiscounts(age);
        float expectedResult = discount;

        assert(actualResult == expectedResult);
    }
}
