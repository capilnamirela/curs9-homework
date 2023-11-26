package org.fasttrackit.curs9.homework9.exercises.ex3;

import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        HashSet<Person> setEmployees = new HashSet<>();

        Person manager = new Person();
        Boolean verif = false;
        for (Person pers : setEmployees) {
            if (pers.getPosition() == "Manager") {
                verif = true;
            }
        }
        if (verif == false) { setEmployees.add(manager);}

        Person anotherManager = new Person();
        verif = false;
        for (Person pers : setEmployees) {
            if (pers.getPosition() == "Manager") {
                verif = true;
            }
        }
        if (verif == false){setEmployees.add(anotherManager);}


        Person welder1 = new Person("Mihai", 25, "welder");
        setEmployees.add(welder1);
        Person welder2 = new Person("George", 27, "welder");
        setEmployees.add(welder2);

        Person carpenter1 = new Person("Andrei", 33, "carpenter");
        setEmployees.add(carpenter1);
        Person carpenter2 = new Person("Mihai", 42, "carpenter");
        setEmployees.add(carpenter2);

        Person plummer1 = new Person("Adrian", 44, "plummer");
        setEmployees.add(plummer1);
        Person plummer2 = new Person("Gigel", 55, "plummer");
        setEmployees.add(plummer2);

        System.out.println(setEmployees);

        for (Person pers : setEmployees) {
            if (pers.getPosition() == "Manager") {
                System.out.println(pers);
            }
        }
        System.out.println("-----------------");
        String profession = "carpenter";
        for (Person pers : setEmployees) {
            if (pers.getPosition() == "carpenter") {
                System.out.println(pers);
            }
        }

        System.out.println("------------------");

        int olderAge = 35;
        for (Person pers : setEmployees) {
            if (pers.getAge() > olderAge) {
                System.out.println(pers);
            }
        }
        System.out.println("---------------------");

        String namePers = "e";
        for (Person pers : setEmployees) {
            if (pers.getName().contains(namePers)) {
                System.out.println(pers);
            }
        }

        Person person = new Person("Alin", 56, "carpenter");
        setEmployees.add(person);
        System.out.println(setEmployees);


    }
}
