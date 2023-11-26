package org.fasttrackit.curs9.code.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {

        List<Integer> listNumbers = List.of(1,2,4,4,5,5);
        System.out.println(listNumbers);

        Set<Integer> setNumbers = new HashSet<>();
        setNumbers.add(1);
        setNumbers.add(2);
        setNumbers.add(4);
        setNumbers.add(4);
        setNumbers.add(5);
        setNumbers.add(5);
        System.out.println(setNumbers);

        HashSet<Student> students = new HashSet<>();

        Student student = new Student(44, "Mihai");
        System.out.println(student.hashCode());
        Student anotherStudent = new Student(31, "George");
        System.out.println(anotherStudent.hashCode());
        Student someStudent = new Student(31, "Ghiorghita");

        students.add(student);
        students.add(someStudent);
        students.add(someStudent);

        System.out.println(students);

        TreeSet<Integer> treeSetOfIntegers = new TreeSet<>();
        treeSetOfIntegers.add(22);
        treeSetOfIntegers.add(31);
        treeSetOfIntegers.add(66);
        treeSetOfIntegers.add(77);
        treeSetOfIntegers.add(11);
        treeSetOfIntegers.add(4);
        System.out.println(treeSetOfIntegers);
        System.out.println(treeSetOfIntegers.descendingSet());


    }
}
