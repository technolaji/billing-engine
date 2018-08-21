package com.bolaji.abiodun;

import java.text.DecimalFormat;
import java.util.List;

class BillingEngine {

    private static DecimalFormat df = new DecimalFormat("#.00");


    static double getBill(List<Service> serviceList, Patient patient){

        double servicePrices = ServicesCalculator.calculateServicesPrice(serviceList);
        if(checkInsurance(patient, serviceList)){
            servicePrices = adjustForInsurance(servicePrices);
        }
        return Double.parseDouble(
                df.format(DiscountsCalculator.calculateDiscounts(patient, servicePrices)));
    }

    static boolean checkInsurance(Patient patient, List<Service> serviceList){
        boolean containsDiagnosis = serviceList.stream().anyMatch(x -> x == Service.DIAGNOSIS);

        if (!containsDiagnosis) {
            return false;
        }

        boolean containsBloodTest = serviceList.stream().anyMatch(x -> x == Service.BLOODTEST);

        if (!containsBloodTest) {
            return false;
        }

        return patient.isPatientInsured();
    }

    static double adjustForInsurance(double totalPrice){

        double bloodTestPrice = ServicesCalculator.PriceMap.get(Service.BLOODTEST.getService());
        double adjustedPrice = totalPrice - bloodTestPrice ;
        double result = adjustedPrice + DiscountsCalculator.calculateInsuranceDiscount(bloodTestPrice);
        return Double.parseDouble(df.format(result));
    }

}
