package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;

import java.util.Arrays;
import java.util.List;


public class FilterBySalary {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee(1, "John", "IT", 50000, 25),
                new Employee(2, "David", "HR", 40000, 28),
                new Employee(3, "Smith", "IT", 70000, 30),
                new Employee(4, "Mike", "Finance", 35000, 24),
                new Employee(5, "Chris", "IT", 80000, 35));

 //     Question 1: Using Stream API, find all employees whose salary is greater than 50000
        System.out.println("By Approach 1 : Entire Object : ");
        employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .forEach(System.out::println);

        System.out.println();
        System.out.println("By Approach 2 : Only Names : ");
        employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println();

//      Question 2. Find employees whose salary is greater than 50000 and department is IT.
        System.out.println("employees whose salary is greater than 50000 and department is IT : ");
        employees.stream()
                .filter(emp -> emp.getSalary() > 50000
                        && emp.getDepartment().equalsIgnoreCase("IT"))
                .forEach(System.out::println);

        System.out.println();

//      Question 3. Count such employees.
        long count = employees.stream()
                .filter(emp -> emp.getSalary() > 50000
                        && emp.getDepartment().equalsIgnoreCase("IT"))
                .count();

        System.out.println("Employee count :  " + count);

        System.out.println();

//      Question 4 : Find first employee matching condition
        System.out.println("first employee matching condition :  ");
        employees.stream().filter(emp -> emp.getSalary() > 50000)
                .findFirst()
                .ifPresent(System.out::println);

    }
}
