package com.googlecode.practicemyjava.java8.stream;

public class Employee {
    private final String employeeId;
    private final String firstName;
    private final String lastName;
    private final String jobTitle;
    private final int age;

    public Employee(final String employeeId, final String firstName, final String lastName, final String jobTitle, final int age) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.age = age;
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

    public int getAge() {
        return age;
    }
}
