package com.pm.billingservice2.dto;

public class BillingRequestDTO {
    private String patientId;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    private String email;

    // getters and setters

    @Override
    public String toString() {
        return "BillingRequestDTO{" +
                "patientId='" + patientId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
