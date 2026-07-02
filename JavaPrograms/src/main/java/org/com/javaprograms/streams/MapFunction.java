package org.com.javaprograms.streams;

  /*
       The map function is used to transform each element of a stream into another form.
       It takes a Function as an argument, which defines how to transform the elements.
       The map function returns a new stream consisting of the transformed elements.
   */

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.List;
import java.util.stream.Collectors;

public class MapFunction {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Example 1: Using map to extract employee names
        System.out.println("Employee Names : ");

        List<String> namesList = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        namesList.forEach(System.out::println);

        System.out.println();
        // Example 2 Get all employee salaries.
        System.out.println("Employee Salaries : ");
        List<Double> salaryList = employees.stream()
                .map(Employee::getSalary)
                .toList();
        salaryList.forEach(System.out::println);

        System.out.println();

       // Example 3: Convert all employee names in uppercase

        employees.stream()
                .map(Employee::getName)
                .map((name) -> name.toUpperCase())
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
    }
}
