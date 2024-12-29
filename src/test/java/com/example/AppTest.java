package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testPersonFullName() {

        Person aminaBouchikhi = Person.builder()
                .firstName("Amina")
                .lastName("Bouchikhi")
                .build();

        assertEquals("Amina Bouchikhi", aminaBouchikhi.fullName());
    }

    @Test
    public void testAuthorisationDeConduite() {

        Person amine = Person.builder()
                .firstName("amine")
                .age(17.99)
                .build();

        assertFalse( amine.isEligibleToDive());

        Person jalal = Person.builder()
                .firstName("jalal")
                .age(20)
                .build();

        assertTrue(jalal.isEligibleToDive());
    }

}
