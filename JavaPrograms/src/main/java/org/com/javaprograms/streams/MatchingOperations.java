package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.ArrayList;
import java.util.List;

public class MatchingOperations {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Q1 : Is there any employee earning more than 75000?
        boolean exists = employees.stream()
                .anyMatch(emp -> emp.getSalary() > 75000);
        System.out.println(exists);

        // Q2 : Are all employees older than 20?
        boolean ageexists = employees.stream()
                .allMatch(emp -> emp.getAge() > 20);

        System.out.println(ageexists);

        //Is there no employee with salary less than 0?
        boolean salaryLess = employees.stream()
                .noneMatch(emp -> emp.getSalary() < 0);
        System.out.println(salaryLess);

        // Is there any employee in the IT department earning more than 70000?
        boolean check = employees.stream()
                .anyMatch(emp -> "IT".equalsIgnoreCase(emp.getDepartment()) && emp.getSalary() > 70000);
        System.out.println(check);

        // Are all IT employees earning more than 40000?
        boolean check1 = employees.stream()
                .allMatch(emp -> "IT".equalsIgnoreCase(emp.getDepartment()) && emp.getSalary() > 40000);

        //or
         boolean check2 = employees.stream()
                         .filter(emp -> "IT".equalsIgnoreCase(emp.getDepartment()))
                                 .allMatch(emp -> emp.getSalary() > 40000);
         // which one to use


        System.out.println(check1);
        System.out.println(check2);
    }
}
