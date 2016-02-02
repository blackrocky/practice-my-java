package com.googlecode.practicemyjava.java8.stream;

public class Employee {
    private final String employeeId;
    private final String firstName;
    private final String lastName;
    private final String jobTitle;

    public Employee(final String employeeId, final String firstName, final String lastName, final String jobTitle) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
