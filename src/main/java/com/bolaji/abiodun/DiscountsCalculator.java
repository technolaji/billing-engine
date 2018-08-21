package com.bolaji.abiodun;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

final class DiscountsCalculator {


    private static final double InsuranceDiscount = 0.85;

    private static final LinkedHashMap<Integer, Float> DiscountsMap = new LinkedHashMap<Integer, Float>() {{
        put(0, 0f);
        put(4, 0.6f);
        put(64, 0.0f);
        put(70, 0.4f);
        put(Integer.MAX_VALUE, 0.1f);
    }};



    static float getDiscounts(int age) {

        List<Integer> sortedList = DiscountsMap.keySet().stream().sorted().collect(Collectors.toList());
        Iterator itr = sortedList.iterator();

        int current = -1;
        int next;

        while (itr.hasNext()) {
            next = (Integer) itr.next();
            if (current != -1) {

                if (isBetween(age, current, next)) {
                    return (DiscountsMap.get(next));
                }
            }
            current = next;
        }
        return 0;
    }


    static boolean isBetween(int i, int minValueInclusive, int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }


    static double calculateDiscounts(Patient patient, double totalPrice){

        DecimalFormat df = new DecimalFormat("#.00");

        double result = getDiscounts(patient.getAge()) * totalPrice;
        return Double.parseDouble(df.format(result));
    }

    static double calculateInsuranceDiscount(double servicePrice){
        return servicePrice * InsuranceDiscount;
    }

}
