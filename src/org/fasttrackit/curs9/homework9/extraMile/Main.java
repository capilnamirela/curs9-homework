package org.fasttrackit.curs9.homework9.extraMile;


public class Main {
    public static void main(String[] args) {

        Integer[] myArray = {1, 2, 4, 5, 7, 25, 33};

        addElement(myArray, 8);

        System.out.println();

        System.out.println(getIndex(myArray, 7));
        System.out.println(getIndex(myArray, 25));

        removeIndex(myArray, 4);

    }

    public static Integer[] addElement(Integer[] myArray, int element) {
        Integer[] otherArray = new Integer[myArray.length + 1];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < element) {
                otherArray[j] = myArray[i];
                System.out.print(otherArray[j] + " ");
                j++;
            }
        }
        otherArray[j] = element;
        System.out.print(otherArray[j] + " ");
        for (int i = j; i < myArray.length; i++) {
            otherArray[j + 1] = myArray[i];
            j++;
            System.out.print(otherArray[j] + " ");
        }

        return otherArray;

    }

    public static Integer getIndex(Integer[] myArray, Integer number) {
        Integer index = myArray.length;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == number) {
                index = i;
            }

        }
        return index;
    }

    public static Integer[] removeIndex(Integer[] myArray, Integer index) {
        Integer[] otherArray = new Integer[myArray.length - 1];
        int j = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (i != index) {
                otherArray[j] = myArray[i];
                System.out.print(otherArray[j] + " ");
                j++;
            }
        }
        return otherArray;

    }
}
