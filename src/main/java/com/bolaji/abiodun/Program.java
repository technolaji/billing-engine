package com.bolaji.abiodun;

import java.io.IOException;
import java.util.*;

public class Program {


    public static void main(String[] args) throws IOException {

        final ArrayList<Service> serviceList = new ArrayList<>();
        Patient patient = null;

        final Scanner in = new Scanner(System.in);
        in.useLocale(new Locale("en", "US"));

        label:
        while (in.hasNextLine()) {
            final String type = in.next();

            switch (type) {
                case "Patient":
                    final int age = in.nextInt();
                    final boolean isInsured = in.nextBoolean();
                    patient = new Patient(age, isInsured);
                    break;
                case "Service":
                    final String serviceName = in.next();
                    Service service = Service.valueOf(serviceName.toUpperCase());
                    serviceList.add(service);
                    break;
                case "getBill":
                    break label;
                default:
                    // ignore
                    break;
            }
        }
        final double result = BillingEngine.getBill(serviceList, patient);
        StringBuilder output = new StringBuilder("Total bill is: ");
        output.append(result);

        System.out.println(output);
    }
}
