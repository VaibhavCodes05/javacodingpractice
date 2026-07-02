package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMap {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Map<Integer, Employee>
        Map<Integer, Employee> collect =
                employees.stream()
                .collect(Collectors.toMap(Employee::getId,
                        Function.identity()));

        collect.forEach((id,emp)->{
            System.out.println(id + " -> "+emp);
        });

        // to map of id ,name
        Map<Integer, String> collect1 = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName
                ));
        collect1.forEach((id,emp)->{
            System.out.println(id + " -> "+emp);
        });

        Map<String, Double> collect2 = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getName,
                        Employee::getSalary
                ));
        collect2.forEach((name,sal)->{
            System.out.println(name + " -> "+sal);
        });

        System.out.println();
        Map<String, String> collect3 = employees.stream()
                .collect(Collectors.toMap(
                        Employee::getDepartment,
                        Employee::getName,
                        (oldValue, newValue) -> oldValue
                ));

        collect3.forEach((dept,name)->{
            System.out.println(dept + " -> "+name);
        });

    }
}
