package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        //Sort employees by salary ascending.
        System.out.println("Salary in Ascending order");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .forEach(emp -> System.out.println(emp.getName() + " " + (int)emp.getSalary()));

        System.out.println("---");
        System.out.println("Salary in Descending order:");
        // descending order
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(emp -> System.out.println(emp.getName() + " " + (int)emp.getSalary()));

        System.out.println("---");

        // Get employee names sorted by salary descending.
        System.out.println("Employee names sorted by salary descending :");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("---");
        // Sort by salary descending, and if salaries are equal, sort by name ascending.
        System.out.println("Employee names sorted by salary descending  and names ascending :");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()
                        .thenComparing(Employee::getName))
		        .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("---");
        // Sort employees by age ascending.
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getAge))
                        .forEach(emp -> System.out.println(emp.getName() + " " + emp.getAge()));

        System.out.println("---");
//       Sort employees alphabetically by name.
        System.out.println("Sort employees alphabetically by name. : ");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(System.out::println);

        System.out.println("---");
        // Sort By Department Then Name
        System.out.println("Sort By Department Then Name : ");
        employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getName))
                .forEach(System.out::println);

    System.out.println("---");
//    Sort By Salary Desc Then Age Asc
        System.out.println("Sort By Salary Desc Then Age Asc : ");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()
                        .thenComparing(Employee::getAge))
                .forEach(System.out::println);

        System.out.println("---");

       // Sort names based on length
        System.out.println("Sort names based on length :  ");
        employees.stream()
                .sorted(Comparator.comparingInt(emp -> emp.getName().length()))
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("---");

        // Sort By Last Character Of Name
        System.out.println("Sort By Last Character Of Name :");
        employees.stream()
                .map(Employee::getName)
                .sorted(Comparator.comparing(name -> name.charAt(name.length()-1)))
                .forEach(System.out::println);

        System.out.println("---");

        // Top 3 Highest Salaries
        System.out.println("Top 3 Highest Salaries :");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---");

        //Second Highest Salary
        System.out.println("Second Highest Salary :");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(2)
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("---");

        //Nth Highest Salary
        int n = 3;
        System.out.println("nth Highest Salary :");
        employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .skip(n-1)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("---");

      //Find second highest distinct salary.
        employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("---");
        //Find third highest distinct salary.
        employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("---");

        // Find employee(s) having second highest salary.
        List<Employee> earners = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .map(secondHighestSalary -> employees.stream()
                        .filter(emp -> emp.getSalary() == secondHighestSalary)
                        .collect(Collectors.toList()))
                .orElse(Collections.emptyList());

        earners.forEach(System.out::println);




    }



}
