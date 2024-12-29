package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionRetrievalTime {
    public static void main(String[] args) {
        List<Person> arrayList = new ArrayList<>();
        List<Person> linkedList = new LinkedList<>();
        Set<Person> hashSet = new HashSet<>();
        Map<String, Person> hashMap = new HashMap<>();
        SortedSet<Person> treeSet = new TreeSet<>();

        // Adding 1,000,000 unique Person objects
        for (int i = 0; i < 1_000_000; i++) {
            Person person = Person.builder().lastName("Person" + i).build();
            arrayList.add(person);
            linkedList.add(person);
            hashSet.add(person);
            hashMap.put(person.getLastName(), person); // Name used as key for retrieval
            treeSet.add(person); // Adds to TreeSet (SortedSet) by natural order (name)
        }

        // Index to retrieve (middle of the list)
        int targetIndex = 900_000;
        Person target = arrayList.get(targetIndex);

        // ArrayList retrieval by index
        long startTime = System.nanoTime();
        arrayList.get(targetIndex); // Access by index
        long endTime = System.nanoTime();
        System.out.println("ArrayList retrieval by index time: " + (endTime - startTime) / 1_000 + " µs");

        // LinkedList retrieval by index
        startTime = System.nanoTime();
        linkedList.get(targetIndex); // Access by index (inefficient for LinkedList)
        endTime = System.nanoTime();
        System.out.println("LinkedList retrieval by index time: " + (endTime - startTime) / 1_000 + " µs");

        // ArrayList retrieval by value
        startTime = System.nanoTime();
        arrayList.contains(target); // Search by value
        endTime = System.nanoTime();
        System.out.println("ArrayList retrieval by value time: " + (endTime - startTime) / 1_000 + " µs");

        // LinkedList retrieval by value
        startTime = System.nanoTime();
        linkedList.contains(target); // Search by value
        endTime = System.nanoTime();
        System.out.println("LinkedList retrieval by value time: " + (endTime - startTime) / 1_000 + " µs");

        // HashSet retrieval by value
        startTime = System.nanoTime();
        hashSet.contains(target); // Example using HashSet with target element
        endTime = System.nanoTime();
        System.out.println("HashSet retrieval by value time: " + (endTime - startTime) / 1_000 + " µs");

        // HashMap retrieval by key
        startTime = System.nanoTime();
        hashMap.get(target.getLastName()); // Retrieve by name (key)
        endTime = System.nanoTime();
        System.out.println("HashMap retrieval by key time: " + (endTime - startTime) / 1_000 + " µs");

        // TreeSet (SortedSet) retrieval by value
        startTime = System.nanoTime();
        treeSet.contains(target); // Searches by natural order defined in compareTo
        endTime = System.nanoTime();
        System.out.println("TreeSet retrieval by value time: " + (endTime - startTime) / 1_000 + " µs");
    }
}
