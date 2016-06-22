package com.googlecode.practicemyjava.java8.stream;

public class Employee {
    private final String employeeId;
    private final String firstName;
    private final String lastName;
    private final String jobTitle;
    private final int age;
    private final Gender gender;

    public Employee(final String employeeId, final String firstName, final String lastName, final String jobTitle, final int age, final Gender gender) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public enum Gender {
        MALE, FEMALE
    }
}
