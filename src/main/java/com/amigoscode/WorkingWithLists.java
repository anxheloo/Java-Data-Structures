package com.amigoscode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");

        colors.add(1);
        colors.add(new Object());

        System.out.println(colors);

        //To specify the type of data we want to inlcude in the list we use :
        List<String> list = new ArrayList<>(); // We can only add String in the List
        list.add("blue");
        list.add("purple");


        //If we want to know the size of the list we use :
        System.out.println("--------------------Printing the size of the list---------------------------------------------------");
        System.out.println(list.size());


        System.out.println("------------------Check if the list contains an element------------------------------------");
        System.out.println(list.contains("blue"));
        System.out.println(list.contains("pink"));

        System.out.println("------------------To loop through the List---------------------------------------------");


        for(String lists:list)
        {
            System.out.println(lists);
        }

        System.out.println("----------------Looping through using the other way-------------------------------------");
        list.forEach(System.out::println);

        System.out.println("----------------Looping thorugh using the traditional way -------------------------------");
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("----------------------------------------------------------------------------------");

        //Using this kind of list, we cant modify the list
        List<String> unmodified = List.of(
                "blue",
                "purple"
        );

        System.out.println(unmodified);




    }
}
