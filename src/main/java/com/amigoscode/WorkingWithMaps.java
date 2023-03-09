package com.amigoscode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {

    public static void main(String[] args) {


       Map<Person,Diamond> map = new HashMap<>();
       map.put(new Person("Jamila"),new Diamond("African Diamond"));

        System.out.println(new Person("Jamila").hashCode());

        System.out.println(map.get(new Person("Jamila")));


    }

    public static void maps()
    {
        Map<Integer,Person> map = new HashMap<>();
        map.put(1,new Person("Alex"));
        map.put(2,new Person("Alexa"));
        map.put(3,new Person("Maria"));
        map.put(3,new Person("Maria")); //  this will not have any affect cuz dublicates doesnt affect the code
        map.put(3,new Person("Maria 2")); //this entry will override the privious entry with the same key

        System.out.println(map);
        System.out.println(map.size()); //this will print the size of 3.

        System.out.println("-------------------------------------------------------------------------");

        System.out.println(map.get(1));//this will get the entry with the key 1 , Person with name Alex
        System.out.println(map.containsKey(4)); // this will print false cuz we dont have any entry with key 4
        System.out.println(map.keySet()); //this gives back a list of numbers, keys
        System.out.println(map.entrySet()); // this gives the list of entry set
        map.remove(3);//to remove we use this method passing the key we want to remove

        System.out.println("----------------Looping through the map-----------------------------");
        System.out.println("WAY 1");
        map.entrySet().forEach(System.out::println);

        System.out.println("WAY 2");
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println("WAY 3");
        map.forEach((key,person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.get(3)); // this will return null cuz we removed the person at key 3(line 26 of code)

        System.out.println(map.getOrDefault(3,new Person("Default"))); // instead of null we get the default person

        System.out.println(map.values()); // if we want to get just the values
    }



    //record Person(String name){}

    //We created the Class Person and overrided the equals() and hashcode(),
    //so for any given identical object they will always return the exact same hashcode
    static class Person{

        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Diamond(String name){}
}
