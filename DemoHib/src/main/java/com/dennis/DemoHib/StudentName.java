package com.dennis.DemoHib;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentName {

    private String fName;
    private String middleName;
    private String surName;

    // Getters and Setters
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "StudentName [fName=" + fName + ", middleName=" + middleName + ", surName=" + surName + "]";
    }
}
