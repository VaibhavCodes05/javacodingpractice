package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMin {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();

        //Find Employee Having Highest Salary
        System.out.println("Employee Having Highest Salary : ");
        employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(System.out::println);

        System.out.println("---");

        // Find Employee Having Lowest Salary
        System.out.println("Employee Having Lowest Salary : ");
        employees.stream()
                .min(Comparator.comparingDouble(Employee::getSalary))
                .ifPresent(System.out::println);

        System.out.println("---");

        // Get Name Of Highest Paid Employee
        System.out.println("Name Of Highest Paid Employee : ");
        List<String> highestpaidEmployees = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(highestSalary -> employees.stream()
                        .filter(emp -> Double.compare(emp.getSalary(), highestSalary.getSalary()) == 0)
                        .map(Employee::getName)
                        .collect(Collectors.toList()))
                .orElse(Collections.emptyList());

        highestpaidEmployees.forEach(System.out::println);

        System.out.println("---");

        // Find Oldest Employee
        System.out.println("Oldest Employee : ");
        employees.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .ifPresent(employee -> System.out.println(employee.getName() + "-" + employee.getAge()));

        System.out.println("---");

        // Find Youngest Employee
        System.out.println("Youngest Employee : ");
        employees.stream()
                .min(Comparator.comparingInt(Employee::getAge))
                .ifPresent(employee -> System.out.println(employee.getName() + "-" + employee.getAge()));


    }
}

