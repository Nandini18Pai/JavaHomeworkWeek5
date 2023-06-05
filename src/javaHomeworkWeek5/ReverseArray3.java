package javaHomeworkWeek5;

import java.util.Arrays;

/**
 * 3. Write a Java program to reverse an array of integer values.
 *
 */
public class ReverseArray3 {

            public static void reverseMethod(){
                int [] array1 = {1782,85,986,356,853,125,856,321,563};
                System.out.println("Original array : " + Arrays.toString(array1));

                for(int i=0;i<array1.length / 2; i++){
                    int temp = array1[i];
                    array1 [i] = array1[array1.length-i-1];
                    array1 [array1.length-i-1] = temp;

                }
                System.out.println("Reverse array: "+ Arrays.toString(array1) );


            }

    public static void main(String[] args) {
        reverseMethod();


    }



}
