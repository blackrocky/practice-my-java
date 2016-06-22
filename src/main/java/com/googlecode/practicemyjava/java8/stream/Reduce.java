package com.googlecode.practicemyjava.java8.stream;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {
    private static final List<Employee> employees = ImmutableList.of(
            new Employee("1", "Tony", "Stark", "Director", 40, Employee.Gender.MALE),
            new Employee("2", "Steve", "Rogers", "Captain", 100, Employee.Gender.MALE),
            new Employee("3", "David", "Banner", "Scientist", 35, Employee.Gender.MALE),
            new Employee("3", "The", "Hulk", "He's always angry", 35, Employee.Gender.MALE),
            new Employee("4", "Natasha", "Rominoff", "Spy", 35, Employee.Gender.FEMALE)
    );

    public static Optional<Employee> findOnlyEmployeeWithId(final String employeeId) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeId().equals(employeeId))
                .reduce((element, otherElement) -> {
                    throw new DuplicateException();
                });
    }

    public static List<Employee> findEmployeAgedLessThan(final int age) {
        return employees.stream().filter(employee -> employee.getAge() < age).collect(Collectors.toList());
    }

    public static int findMaxAge() {
        return employees.stream().mapToInt(Employee::getAge).max().getAsInt();
    }

    public static int findMaxAgeUsingMapReduce() {
        return employees.stream().map(Employee::getAge).reduce(0, (age1, age2) -> age1 >= age2? age1 : age2);
    }

    public static double findAverageAge() {
        return employees.stream().mapToInt(Employee::getAge).average().getAsDouble();
    }

    public static String findHulkJobTitle() {
        return employees.stream().filter(employee -> "Hulk".equals(employee.getLastName())).map(employee -> employee.getJobTitle()).collect(Collectors.toList()).get(0);
    }

    public static Map<Employee.Gender, List<Employee>> groupByGender() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getGender));
    }

    public static Map<Employee.Gender, List<String>> groupByGenderEmployee() {
        return employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getFirstName, Collectors.toList())));
    }
}
