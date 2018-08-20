package com.bolaji.abiodun;

import java.util.*;
import java.util.stream.Collectors;

final class Discounts {

    private static final LinkedHashMap<Integer, Float> DiscountsMap = new LinkedHashMap<Integer, Float>() {{
        put(0, 0f);
        put(4, 0.4f);
        put(64, 0.0f);
        put(70, 0.6f);
        put(Integer.MAX_VALUE, 0.9f);
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
}
