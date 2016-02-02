package com.googlecode.practicemyjava.java8.stream;

import org.junit.Test;

import java.util.Optional;

import static com.googlecode.practicemyjava.java8.stream.Reduce.findOnlyEmployeeWithId;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ReduceTest {
    @Test
    public void should_find_employee_id_1() throws Exception {
        final Optional<Employee> employee1 = findOnlyEmployeeWithId("1");
        assertThat(employee1.isPresent(), is(true));
        assertThat(employee1.get().getFirstName(), is("Tony"));
    }

    @Test
    public void should_not_find_employee_id_5() throws Exception {
        final Optional<Employee> employee1 = findOnlyEmployeeWithId("5");
        assertThat(employee1.isPresent(), is(false));
    }

    @Test(expected = DuplicateException.class)
    public void should_throw_duplicate_exception_for_employee_id_3() throws Exception {
        findOnlyEmployeeWithId("3");
    }
}