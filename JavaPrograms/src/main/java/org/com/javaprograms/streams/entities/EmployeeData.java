package org.com.javaprograms.streams.entities;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    private EmployeeData() {
        // prevent object creation
    }

    public static List<Employee> getEmployees() {

        return Arrays.asList(
                new Employee(1, "John", "IT", 50000, 25),
                new Employee(2, "David", "HR", 40000, 28),
                new Employee(3, "Adam", "HR", 40000, 25),
                new Employee(4, "Sam", "IT", 40000, 24),
                new Employee(5, "Smith", "IT", 70000, 30),
                new Employee(6, "Mike", "Finance", 35000, 24),
                new Employee(7, "Chris", "IT", 80000, 35)
        );
    }
}

