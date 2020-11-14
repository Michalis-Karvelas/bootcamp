package com.company;

public class Trainer {
    private String firstName;
    private String lastName2;
    public String subjects;
    public Trainer(String firstName, String lastName2, String subjects){
        this.firstName=firstName;
        this.lastName2=lastName2;
        this.subjects=subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
}
