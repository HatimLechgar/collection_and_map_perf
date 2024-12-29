package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class InsertExample {
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        List<Person> linkedList = new LinkedList<>();

        // Adding 100,000 Person objects to both lists
        for (int i = 0; i < 1_000_000; i++) {
            Person person = Person.builder().lastName("Person" + i).build();
            arrayList.add(person);
            linkedList.add(person);
        }

        // Create a new Person to insert at index 50000
        Person newPerson = Person.builder().lastName("Person-Insert-50000").build();

        int insertIndex=100;
        // Insert into ArrayList at index 50000
        long startTime = System.nanoTime();
        arrayList.add(insertIndex, newPerson); // This will shift elements to the right
        long endTime = System.nanoTime();
        System.out.println(String.format("ArrayList insertion at index %s time: %s µs",insertIndex, (endTime - startTime) / 1_000));

        // Insert into LinkedList at index 50000
        startTime = System.nanoTime();
        linkedList.add(insertIndex, newPerson); // This will shift elements to the right
        endTime = System.nanoTime();
        System.out.println(String.format("LinkedList insertion at index %s time: %s µs",insertIndex, (endTime - startTime) / 1_000));
    }
}
