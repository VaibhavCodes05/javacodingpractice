package org.com.javaprograms.streams.entities;

import java.util.Arrays;
import java.util.List;

public class Employee1Data {

    private Employee1Data() {
        // prevent object creation
    }

    public static List<Employee1> getEmployees() {
        return Arrays.asList(
                new Employee1(
                        1,
                        "John",
                        Arrays.asList("Java", "Spring", "SQL")
                ),

                new Employee1(
                        2,
                        "David",
                        Arrays.asList("Docker", "AWS")
                ),

                new Employee1(
                        3,
                        "Chris",
                        Arrays.asList("Java", "Kafka")
                )
        );
    }
}
