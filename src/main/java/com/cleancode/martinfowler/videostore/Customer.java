package com.cleancode.martinfowler.videostore;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    private int frequentRenterPoints = 0;
    private double totalAmount = 0;

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        calculateStatementValues();

        return generateStatement();
    }

    private void calculateStatementValues() {
        rentals.forEach(this::calculateFrequentRentalPoints);
        rentals.forEach(rental -> totalAmount += getThisAmount(rental));
    }

    private String generateStatement() {
        StringBuilder builder = new StringBuilder()
                .append("Rental Record for ")
                .append(getName())
                .append("\n");

        for (Rental rental : rentals) {
            builder.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(getThisAmount(rental))
                    .append("\n");
        }

        builder.append("You owed ")
                .append(totalAmount)
                .append("\n");

        builder.append("You earned ")
                .append(frequentRenterPoints)
                .append(" frequent renter points\n");

        return builder.toString();
    }

    private void calculateFrequentRentalPoints(Rental rental) {
        frequentRenterPoints++;

        if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE
                && rental.getDaysRented() > 1) {
            frequentRenterPoints++;
        }
    }

    private double getThisAmount(Rental rental) {
        double thisAmount = 0.0;

        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (rental.getDaysRented() > 2)
                    thisAmount += (rental.getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += rental.getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (rental.getDaysRented() > 3)
                    thisAmount += (rental.getDaysRented() - 3) * 1.5;
                break;
        }

        return thisAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}