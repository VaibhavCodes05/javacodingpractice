package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsGroupingBy {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Group Employees By Department
        Map<String, List<Employee>> departmentGroup = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        departmentGroup.forEach((department, employeeList) -> {
            System.out.println(department);
            employeeList.forEach(employee -> System.out.println(" " + employee.getName()));
        });

        // Count employees in each department.
        Map<String, Long> countMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

        countMap.forEach((department, count) -> {
            System.out.println(department + " -> " + count);
        });

        // Which department has maximum
        //approach 1 :
        Optional<Map.Entry<String, Long>> maxCountDept1 = countMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        maxCountDept1.ifPresent(System.out::println);

        //approach 2:
        Optional<Map.Entry<String, Long>> maxCount2 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());
        maxCount2.ifPresent(System.out::println);

        // Average Salary By Department
        Map<String, Double> avgSalaryMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryMap.forEach((department, avgSalary) -> {
            System.out.println(department + " -> " + avgSalary);
        });

        System.out.println();

        // Name of department with maximum employees
        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .ifPresent(System.out::println);


        System.out.println();
//        Highest Paid Employee In Each Department

        Map<String, Optional<Employee>> empMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        empMap.forEach((department, emp) -> {
            System.out.println(department);
            emp.ifPresent(employee -> System.out.print(" -> " + employee.getName()));
        });

        Map<String, Employee> objmap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
                                Optional::get)));

        objmap.forEach((department, emp) -> {
            System.out.println(department  + " -> " + emp);
        });

        System.out.println();
        // Department Having Highest Average Salary
        employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .ifPresent(System.out::println);

    }
}
