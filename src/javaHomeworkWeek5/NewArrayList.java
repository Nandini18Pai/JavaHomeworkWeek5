package javaHomeworkWeek5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 *
 */
public class NewArrayList {

public static void newArrayList(){
    List<String> list = new ArrayList<>();
    list.add("Red");
    list.add("White");
    list.add("Blue");
    list.add("Black");
    list.add("Pink");
    System.out.println(list);
}
    public static void main(String[] args) {
    newArrayList();
    }
}
