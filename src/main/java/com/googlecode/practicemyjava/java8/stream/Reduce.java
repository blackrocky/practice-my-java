package com.googlecode.practicemyjava.java8.stream;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reduce {
    private static final List<Employee> employees = ImmutableList.of(
            new Employee("1", "Tony", "Stark", "Director", 40),
            new Employee("2", "Steve", "Rogers", "Captain", 100),
            new Employee("3", "David", "Banner", "Scientist", 35),
            new Employee("3", "The", "Hulk", "He's always angry", 35)
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

    public static String findHulkJobTitle() {
        return employees.stream().filter(employee -> "Hulk".equals(employee.getLastName())).map(employee -> employee.getJobTitle()).collect(Collectors.toList()).get(0);
    }
}
