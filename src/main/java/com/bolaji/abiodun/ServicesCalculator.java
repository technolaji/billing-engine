package com.bolaji.abiodun;

import java.util.HashMap;
import java.util.List;

class ServicesCalculator {

    private static final double vaccineServiceCalculator = 27.50;

    static final HashMap<String, Float> PriceMap = new HashMap<String, Float>() {{
        put("diagnosis", 60f);
        put("xray", 150f);
        put("bloodtest", 78f);
        put("ecg", 200.40f);
        put("vaccine", 15f);
    }};

    static double calculateServicesPrice(List<Service> servicesList){

        double servicesPrices = servicesList.stream().mapToDouble(x -> PriceMap.get(x.getService())).sum();
        if(shouldChargeVaccineService(servicesList)){
            return servicesPrices + vaccineServiceCalculator;
        }
        return servicesPrices;
    }

    private static boolean shouldChargeVaccineService(List<Service> serviceList){
        return serviceList.stream().anyMatch(x -> x == (Service.VACCINE));
    }



}
