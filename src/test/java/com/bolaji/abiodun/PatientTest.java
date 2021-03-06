package com.bolaji.abiodun;


import org.junit.Test;

public class PatientTest {


    @Test
    public void getAgeTest() {

        Patient patient = new Patient(60, false);

        int actualResult = patient.getAge();
        int expectedResult = 60;

        assert actualResult == expectedResult;
    }


    @Test
    public void isPatientInsuredTest() {

        Patient patient = new Patient( 60, true);

        boolean actualResult = patient.isPatientInsured();
        boolean expectedResult = true;

        assert actualResult == expectedResult;
    }


}
