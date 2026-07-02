package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.ArrayList;
import java.util.List;

public class Distinct {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Example 1: Using distinct to get unique employee departments
        System.out.println("Unique Employee Departments : ");
        employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);

        System.out.println();
        // Example 2 : get Count of Unique departments
        long count = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .count();
        System.out.println("Count of Unique departments : " +count);

        System.out.println();

        // Example 3 : Get all unique employee ages.
        List<Integer> ageList = employees.stream()
                .map(Employee::getAge)
                .distinct()
                .toList();
        ageList.forEach(System.out::println);

    }
}
