package com.cleancode.martinfowler.videostore;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoStoreRefactoredTest {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("Fred");
    }

    // TODO list
    // cambiar nombre del metodo getTotalAmount por getTotalAmountOwed

    @Test
    public void testSingleNewReleaseStatement() {
        customer.addRental(new Rental(new Movie("The Cell", Movie.NEW_RELEASE), 3));
        customer.statement();

        assertEquals(9.0, customer.getTotalAmount(), 0);
        assertEquals(2, customer.getFrequentRenterPoints());
    }

    @Test
    public void testDualNewReleaseStatement() {
        customer.addRental(new Rental(new Movie("The Cell", Movie.NEW_RELEASE), 3));
        customer.addRental(new Rental(new Movie("The Tigger Movie", Movie.NEW_RELEASE), 3));
        customer.statement();

        assertEquals(18.0, customer.getTotalAmount(), 0);
        assertEquals(4, customer.getFrequentRenterPoints());
    }

    @Test
    public void testSingleChildrensStatement() {
        customer.addRental(new Rental(new Movie("The Tigger Movie", Movie.CHILDRENS), 3));
        customer.statement();

        assertEquals(1.5, customer.getTotalAmount(), 0);
        assertEquals(1, customer.getFrequentRenterPoints());
    }

    @Test
    public void testMultipleRegularStatement() {
        customer.addRental(new Rental(new Movie("Plan 9 from Outer Space", Movie.REGULAR), 1));
        customer.addRental(new Rental(new Movie("8 1/2", Movie.REGULAR), 2));
        customer.addRental(new Rental(new Movie("Eraserhead", Movie.REGULAR), 3));
        customer.statement();

        assertEquals(7.5, customer.getTotalAmount(), 0);
        assertEquals(3, customer.getFrequentRenterPoints());
    }
}