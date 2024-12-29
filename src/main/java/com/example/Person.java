package com.example;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
public class Person implements Comparable<Person>
{

    private String firstName;
    private String lastName;
    private double age;

    public String fullName() {
        return firstName + " " + lastName;
    }

    public boolean isEligibleToDive() {
        return this.age >= 18.00;
    }


    @Override
    public int compareTo(Person other) {
        return this.lastName.compareTo(other.lastName);
    }


    public int hashCode() {
        return lastName.length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return lastName.equals(person.lastName);
    }
}
