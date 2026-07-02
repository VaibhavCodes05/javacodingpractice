package org.com.javaprograms.streams;

import org.com.javaprograms.streams.entities.Employee;
import org.com.javaprograms.streams.entities.EmployeeData;

import java.util.List;
import java.util.Optional;

public class Reduce {

    public static void main(String[] args) {

        List<Integer> numbers =
                List.of(1,2,3,4,5);

        System.out.println("Sum without identity: ");
       // Sum of numbers using reduce().
        numbers.stream()
                .reduce((a,b) -> {
                   return a+b;
                })
                .ifPresent(System.out::println);

        System.out.println("-------------------");
        System.out.println("Sum with identity: ");
      int sum =  numbers.stream()
                .reduce(
                        0,
                        (a,b) -> a+b
                );
        System.out.println(sum);

//        Maximum number using reduce().

        System.out.println("-------------------");
        System.out.println("Maximum number using reduce : ");

        Optional<Integer> max = numbers.stream()
                .reduce((a, b) -> a > b ? a : b);
        max.ifPresent(System.out::println);

        System.out.println("-------------------");
        System.out.println("maximum number using reduce 2nd option: ");
        numbers.stream()
                .reduce(Integer::max)
                .ifPresent(System.out::println);

//        Minimum number using reduce().
        numbers.stream()
                .reduce((a , b) -> a < b ? a : b)
                .ifPresent(System.out::println);



//        Concatenate strings.
        List<String> words =
                List.of(
                        "Java",
                        "Spring",
                        "Kafka"
                );

        System.out.println("--------------------");
        System.out.println("Concatenate Strings :");
        String str = words.stream()
                .reduce((s1, s2) -> s1 + s2)
                .orElse(" ");
        System.out.println(str);


//        Sum of employee salaries.
        List<Employee> employees = EmployeeData.getEmployees();
        double sumOfSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .reduce((s1, s2) -> s1 + s2)
                .orElse(0);

        System.out.println(sumOfSalary);

    }
}
