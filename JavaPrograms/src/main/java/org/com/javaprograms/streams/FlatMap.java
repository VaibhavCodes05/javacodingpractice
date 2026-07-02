package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee1;
import org.com.javaprograms.streams.entities.Employee1Data;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {


    public static void main(String[] args) {
        List<Employee1> employees = Employee1Data.getEmployees();

        System.out.println("Get all Skills : ");
        //    Get all skills
        employees.stream()
                .flatMap(emp-> emp.getSkills().stream())
                .forEach(System.out::println);


        System.out.println("--------------");
        System.out.println("unique skills : ");
        //    Get unique skills.
        List<String> uniqueSkills = employees.stream().flatMap(emp -> emp.getSkills().stream())
                .distinct()
                .collect(Collectors.toList());

        uniqueSkills.forEach(System.out::println);


        System.out.println("--------------");
        System.out.println("Sorted : ");
//    Sort all skills.
        employees.stream().flatMap(emp -> emp.getSkills().stream())
                .distinct()
                .sorted()
                .forEach(System.out::println);


        System.out.println("--------------");
        System.out.println(" Count of Unique skills : ");
        long count = employees.stream().flatMap(emp -> emp.getSkills().stream())
                .distinct()
                .count();
        System.out.println(count);

    }
}
