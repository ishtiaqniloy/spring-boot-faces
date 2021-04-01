package com.example.JsfDemo.model.enums;

public enum BloodGroup {
    O_POSITIVE("O+"),
    O_NEGATIVE("O-"),
    A_POSITIVE("A+"),
    A_NEGATIVE("A-"),
    B_POSITIVE("B+"),
    B_NEGATIVE("B-"),
    AB_POSITIVE("AB+"),
    AB_NEGATIVE("AB-"),
    NO_ANSWER("NA");

    private String bloodGroup;

    BloodGroup (String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }


    public String getBloodGroup() {
        return bloodGroup;
    }
}
