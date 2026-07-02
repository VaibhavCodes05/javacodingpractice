package org.com.javaprograms.streams.entities;

import java.util.List;

public class Employee1 {

    private int id;
    private String name;
    private List<String> skills;

    public Employee1(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + skills;
    }
}
