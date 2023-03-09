package com.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingWithQueuesAndLinkedList {

    public static void main(String[] args) {

        LinkedList<Person>linkedList = new LinkedList<>();

        linkedList.add(new Person("Alex",32));
        linkedList.add(new Person("Alexa",33));

        //using one of the methods addFirst() or addLast()
        linkedList.addFirst(new Person("Ali",18));

        ListIterator<Person>personListIterator = linkedList.listIterator();

        while(personListIterator.hasNext())
        {
            System.out.println(personListIterator.next());
        }


        System.out.println("----------------Print in reverse-------------------------------------------");
        while(personListIterator.hasPrevious())
        {
            System.out.println(personListIterator.previous());
        }


        //queues();


    }

    public static void queues()
    {
        //Queue is an Interface that extends Collection , and LinkedList implements the Queue Interface
        //This use the FIFO way of processing data, first in first out, Great Example: People at supermarket
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex",21));
        supermarket.add(new Person("Mario",18));
        supermarket.add(new Person("Ali",41));

        System.out.println(supermarket);
        System.out.println(supermarket.peek()); //this will print us the first person added.
        System.out.println(supermarket.size());//printing the size

        //To remove a person
        System.out.println("------------------Removing the person at the peek---------------------");
        System.out.println(supermarket.poll());

        System.out.println("-----------------Printing the size after removing-----------------------");
        System.out.println(supermarket.size());

        System.out.println("-----------------Printing the person in the Queue after removing Alex------");
        System.out.println(supermarket.peek());
        System.out.println(supermarket.size());
    }

    static record Person(String name, int age){}
}
