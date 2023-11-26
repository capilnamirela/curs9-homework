package org.fasttrackit.curs9.homework9.exercises.ex2;

import java.util.HashSet;
import java.util.Set;

public class MainBuquet {
    public static void main(String[] args) {

        Set<String> setBuquet = new HashSet<>();
        setBuquet.add("rose");
        setBuquet.add("daisy");
        setBuquet.add("dahlia");
        setBuquet.add("iris");
        setBuquet.add("magnolia");
        setBuquet.add("orchid");

        System.out.println(setBuquet);

        String flower = "salvia";
        setBuquet.add(flower);
        System.out.println(setBuquet);

        String flower1 = "rose";
        setBuquet.add(flower);
        System.out.println(setBuquet);

        if (setBuquet.contains(flower1)) {
            System.out.println("The flower is already in the buquet");
        } else {
            setBuquet.add(flower1);
        }
        System.out.println(setBuquet);

        setBuquet.remove(flower);
        System.out.println(setBuquet);

    }
}
