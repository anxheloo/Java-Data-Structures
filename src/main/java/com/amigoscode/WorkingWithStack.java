package com.amigoscode;

import java.util.Stack;

public class WorkingWithStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        //If we want to add an element into the stack we use push
        stack.push(1);
        stack.push(2);
        stack.push(3); // this is at the top of the stack

        //-------------------------------Find the element at the top of the stack----------------------------------
        System.out.println("Find the element at the top of the stack");
        System.out.println(stack.peek());

        //-----------------------Print the size of the stack--------------------------------------------------
        System.out.println("Print the size of the stack");
        System.out.println(stack.size());

        //---------------------To remove the element from the stack-------------------------------------------
        System.out.println("---------------To remove the element from the stack-------------------------------");
        System.out.println(stack.pop()); // we removed the last element from the stack, this use LIFO
        System.out.println("----------------Print the size of the stack after pop() method");
        System.out.println(stack.size()); // now we only have 2 elements from 3 we had before using pop()


        //-----------------Check the condition if we have an empty stack or not-----------------------------------
        System.out.println("------------------Check the condition if we have an empty stack or not----------------");
        System.out.println(stack.empty());
    }
}
