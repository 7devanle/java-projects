package com.company.roomComponents;

public class Names {
    private String firstName;
    private String lastName;
    private String middleName;

    public Names(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Names(String firstName, String lastName) {
        this(firstName, lastName, "");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
