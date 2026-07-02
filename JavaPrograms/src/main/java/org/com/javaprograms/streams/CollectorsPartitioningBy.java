package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsPartitioningBy {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Partition by salary > 50000
        Map<Boolean, List<Employee>> collect = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000));

        collect.forEach((bool, emps) -> {
            System.out.println(bool);
            emps.forEach(emp ->  System.out.println(" " + emp.getName() + ", "+ emp.getSalary()));
        });

        // Count employees in each partition.
        Map<Boolean, Long> collect1 = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getSalary() > 50000, Collectors.counting()));

        collect1.forEach((bool, emps) -> {
            System.out.println(bool +" -> "+ emps);
        });

//        Partition employees into:
//        Age >= 30
//        Age < 30

        Map<Boolean, List<Employee>> collect2 = employees.stream()
                .collect(Collectors.partitioningBy(emp -> emp.getAge() >= 30));

        collect2.forEach((bool, emps) -> {
            System.out.println(bool);
            emps.forEach(emp ->  System.out.println(" " + emp.getName() + ", "+ emp.getAge()));
        });

// Parttion into IT & Non It

        Map<Boolean, List<Employee>> collect3 = employees.stream()
                .collect(Collectors.partitioningBy(emp -> "IT".equalsIgnoreCase(emp.getDepartment())));

        collect3.forEach((bool, emps) -> {
            if (bool) {
                System.out.println("IT");
            } else {
                System.out.println("NON IT");
            }
            emps.forEach(emp ->  System.out.println(" " + emp.getName() + ", "+ emp.getAge()));
        });

        //Find average salary in each partition

        Map<Boolean, Double> collect4 = employees.stream()
                .collect(Collectors.partitioningBy(emp -> "IT".equalsIgnoreCase(emp.getDepartment()),
                        Collectors.averagingDouble(Employee::getSalary)));
        collect4.forEach((bool, sal) -> {
            System.out.println(bool);
            System.out.println(" -> " + sal);
        });
    }

}
