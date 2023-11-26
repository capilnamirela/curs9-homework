package org.fasttrackit.curs9.homework9.exercises.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainBasket {
    public static void main(String[] args) {
        List<String> basket = new ArrayList<>();
        basket.add("apple");
        basket.add("banana");
        basket.add("mango");
        basket.add("apple");
        basket.add("orange");
        basket.add("mango");

        System.out.println(basket);

        String fruit = "pineapple";
        System.out.println(basket.contains(fruit));
        String fruit1 = "apple";
        System.out.println(basket.contains(fruit1));

        String fruit2 = "banana";
        if (basket.contains(fruit2)) {
            basket.remove(fruit2);
            System.out.println("TRUE - the fruit was deleted");
        } else {
            System.out.println("FALSE - the fruit was not found");
        }
        System.out.println(basket);

        String fruit3 = "orange";
        System.out.println("the position of " + fruit3 + " in the basket is: " + basket.indexOf(fruit3));

        List<String> uniqueCollection = basket.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueCollection);

        basket.add("papaya");
        System.out.println(basket);

        System.out.println("Nr. of fruits in the basket: " + basket.size());

        int numberOfFruits = 0;
        for (String fruit4 : basket) {
            numberOfFruits++;
        }
        System.out.println("Nr. of fruits: " + numberOfFruits);
    }
}
