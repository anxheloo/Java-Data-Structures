package com.amigoscode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        // if we print "colors" it will show the address of the object
        //So in order to print the color Array we use " Arrays.toString(colors)
        System.out.println(Arrays.toString(colors));

        //we can also use:
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        //to change the value we use the name of Array created with the index , and we give the value we want
        colors[0] = "yellow";

        System.out.println(Arrays.toString(colors));


        //-------------------------------------------------------------------------------------------------------------------

        //When we know the elements that our array will have we can directly use :

        int[] numbers = {100,200}; //once we define the array, we are no longer able to change the size

        System.out.println("-----------------Looping through using the traditional way------------------" );

        // To loop through the array , we can use the traditional way :
        for(int i = 0; i < colors.length; i++)
        {
            System.out.println(colors[i]);
        }

        System.out.println("--------------------------In Reverse ---------------------------------------");

        for(int i = colors.length - 1; i >= 0; i--)
        {
            System.out.println(colors[i]);
        }


        System.out.println("--------------------------The Length of the array----------------------------");

        //To know the length of the Array(the size) ,
        System.out.println(colors.length);


        System.out.println("--------------------------Looping through the array using enhanced for loop----");

        // Another way to loop through the array is using enhanced for loop
        for(String color: colors)
        {
            System.out.println(color);
        }

        System.out.println("--------------------Looping through the array using stream-----------------------");

        //The third way of looping through the array is using stream()
        Arrays.stream(colors).forEach(System.out::println);
    }
}
