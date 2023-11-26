package org.fasttrackit.curs9.code.abstracted;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.breaths();
        dog.lives();
        System.out.println(dog.numberOfLegs());
        dog.doSomething();

    }
}
