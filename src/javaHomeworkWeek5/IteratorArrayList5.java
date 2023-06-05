package javaHomeworkWeek5;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 *
 *
 */
public class IteratorArrayList5 {

    public static void array(){

        // Creating and initializing the ArrayList
        // Declaring object of integer type
        List<Integer> numbers = new ArrayList<>();
           numbers.add(1);
           numbers.add(3);
           numbers.add(2);
           numbers.add(5);
           numbers.add(4);
        System.out.println("ArrayList: " + numbers);

            // Iterating using loop

        ListIterator<Integer> iterate =numbers.listIterator();
        System.out.println(" Iterating over ArrayList :  ");
        while (iterate.hasNext()){
            System.out.println(iterate.next() + ", ");
        }
    }
    public static void main(String[] args) {
        array();
    }


}
