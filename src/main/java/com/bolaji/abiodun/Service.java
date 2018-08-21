package com.bolaji.abiodun;

public enum Service {

    DIAGNOSIS("diagnosis"),
    BLOODTEST("bloodtest"),
    XRAY("xray"),
    ECG("ecg"),
    VACCINE("vaccine");

    private String service;

    Service(String service) {
        this.service = service;
    }

    public String getService() {
        return service;
    }
}