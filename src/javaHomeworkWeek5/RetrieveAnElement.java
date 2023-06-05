package javaHomeworkWeek5;

import java.util.ArrayList;

/**
 *
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 *
 */
public class RetrieveAnElement {
        public static void retrieve() {
    ArrayList<String> animals = new ArrayList<>();

    // add elements in the arraylist
    animals.add("Cat");
    animals.add("Dog");
    animals.add("Cow");
    animals.add("Sheep");
    System.out.println("ArrayList: " + animals);

    // get the element from the arraylist
    String str = animals.get(1);
    System.out.print("Element at index 1: " + str);
}

    public static void main(String[] args) {
        retrieve();

    }

}
