package com.googlecode.practicemyjava.java8.stream;

import com.google.common.collect.ImmutableList;

import java.util.List;
import java.util.Optional;

public class Reduce {
    private static final List<Employee> employees = ImmutableList.of(
            new Employee("1", "Tony", "Stark", "Director"),
            new Employee("2", "Steve", "Rogers", "Captain"),
            new Employee("3", "David", "Banner", "Scientist"),
            new Employee("3", "The", "Hulk", "He's always angry")
    );

    public static Optional<Employee> findOnlyEmployeeWithId(final String employeeId) {
        return employees.stream()
                .filter(employee -> employee.getEmployeeId().equals(employeeId))
                .reduce((element, otherElement) -> {
                    throw new DuplicateException();
                });
    }
}
