package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMapping {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeData.getEmployees();
    // Map of Department -> Set of Employee Names
        Map<String, Set<String>> collect = employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(
                                Employee::getName,
                                Collectors.toSet()
                        )));

        collect.forEach((dept,name)->{
            System.out.println(dept + " -> "+name);
        });

        // Department → Highest Paid Employee Name
//        employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment),
//                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
//                        Collectors.mapping(Employee::getName))

    }
}
