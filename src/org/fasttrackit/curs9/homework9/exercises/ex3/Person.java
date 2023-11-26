package org.fasttrackit.curs9.homework9.exercises.ex3;

public class Person implements Company{
    private String name;
    private final String managerName = "Popescu";
    private Integer age;
    private final Integer namagerAge = 45;
    private String position;
    private final String managerialPosition = "Manager";

    public Person(String name, Integer age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }
    public Person() {
        this.name = managerName;
        this.age = namagerAge;
        this.position = managerialPosition;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString(){
        return "Person: %s, %s, %s".formatted(name, age, position);
    }
}
