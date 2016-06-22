package com.googlecode.practicemyjava.java8.stream;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.googlecode.practicemyjava.java8.stream.Reduce.findAverageAge;
import static com.googlecode.practicemyjava.java8.stream.Reduce.findEmployeAgedLessThan;
import static com.googlecode.practicemyjava.java8.stream.Reduce.findHulkJobTitle;
import static com.googlecode.practicemyjava.java8.stream.Reduce.findMaxAge;
import static com.googlecode.practicemyjava.java8.stream.Reduce.findMaxAgeUsingMapReduce;
import static com.googlecode.practicemyjava.java8.stream.Reduce.findOnlyEmployeeWithId;
import static com.googlecode.practicemyjava.java8.stream.Reduce.groupByGender;
import static com.googlecode.practicemyjava.java8.stream.Reduce.groupByGenderEmployee;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReduceTest {
    @Test
    public void should_find_employee_id_1() throws Exception {
        final Optional<Employee> employee = findOnlyEmployeeWithId("1");
        assertThat(employee.isPresent(), is(true));
        assertThat(employee.get().getFirstName(), is("Tony"));
    }

    @Test
    public void should_not_find_employee_id_5() throws Exception {
        final Optional<Employee> employee = findOnlyEmployeeWithId("5");
        assertThat(employee.isPresent(), is(false));
    }

    @Test(expected = DuplicateException.class)
    public void should_throw_duplicate_exception_for_employee_id_3() throws Exception {
        findOnlyEmployeeWithId("3");
    }

    @Test
    public void should_find_employees_less_than_40() {
        final List<Employee> employees = findEmployeAgedLessThan(40);
        for (Employee employee : employees) {
            assertThat(employee.getAge(), lessThan(40));
        }
    }

    @Test
    public void should_find_max_age() {
    	int maxAge = findMaxAge();
        assertThat(maxAge, is(100));
    }

    @Test
    public void should_find_max_age_using_map_reduce() {
    	int maxAge = findMaxAgeUsingMapReduce();
        assertThat(maxAge, is(100));
    }

    @Test
    public void should_find_average_age() {
    	double averageAge = findAverageAge();
        assertThat(averageAge, is(49.0));
    }

    @Test
    public void should_get_hulk_job_title() {
    	String name = findHulkJobTitle();
        assertThat(name, is("He's always angry"));
    }
    
    @Test
    public void should_return_map_of_gender_and_employee() {
    	Map<Employee.Gender, List<Employee>> map = groupByGender();
        assertThat(map.get(Employee.Gender.FEMALE).size(), is(1));
        assertThat(map.get(Employee.Gender.FEMALE).get(0).getFirstName(), is("Natasha"));
        assertThat(map.get(Employee.Gender.MALE).size(), is(4));
    }

    @Test
    public void should_return_map_of_gender_and_employee_first_name() {
    	Map<Employee.Gender, List<String>> map = groupByGenderEmployee();
        assertThat(map.get(Employee.Gender.FEMALE).size(), is(1));
        assertThat(map.get(Employee.Gender.FEMALE).get(0), is("Natasha"));
        assertThat(map.get(Employee.Gender.MALE).size(), is(4));
    }


}