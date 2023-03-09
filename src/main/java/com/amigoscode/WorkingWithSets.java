package com.amigoscode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets {

    public static void main(String[] args) {

        //Set<Ball> balls= new TreeSet<>(); //this gives us natural order to the elements in the set

        Set<Ball> balls= new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Red"));

        System.out.println(balls.size()); //the size will be 3 even that we added red elements 2 more times, cuz dublicates are not allowed

        balls.forEach(System.out::println); //print elements


        balls.remove(new Ball("Red")); //removing an element
        System.out.println(balls.size()); //size will be 2 after removing

    }

    record Ball(String color){}
}
