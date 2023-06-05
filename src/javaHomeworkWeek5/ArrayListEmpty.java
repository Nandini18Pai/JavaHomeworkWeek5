package javaHomeworkWeek5;

import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 *
 *
 */
public class ArrayListEmpty {

    public static void arrayList() {
        // create a arrayList
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Newly Created ArrayList: " + list);
        // checks if the arraylist has any element
        boolean result = list.isEmpty();  // true
        System.out.println("Is the ArrayList empty  " + result);


        // add some elements to the Arraylist
        list.add(" Python");
        list.add(" Java");
        list.add(" c++");
        System.out.println("Updated ArrayList: " + list);

        // Checks is the ArrayList is empty
        result = list.isEmpty();  // false
        System.out.println(" Is the ArrayList empty? " + result);
    }

    public static void main(String[] args) {
        arrayList();
    }


}
