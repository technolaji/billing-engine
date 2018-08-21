package com.bolaji.abiodun;

public class Patient {

    private int age;
    private float discount;
    private boolean isInsured;

    public Patient(int age, boolean isInsured){
        this.age = age;
        this.isInsured = isInsured;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public boolean isPatientInsured() {
        return isInsured;
    }

    public void setPatientIsInsured(boolean insured) {
        isInsured = insured;
    }
}
