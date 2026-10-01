package com.amigoscode._2_developers._10_exceptions;

public class InsufficientFundsException extends Exception{
    // TODO: 1 - Create a custom CHECKED exception class called InsufficientFundsException.
    //  It should:
    //  - Extend Exception (making it a checked exception)
    //  - Have a private final double 'amount' field (the amount that was short)
    //  - Have a constructor that takes a String message and double amount,
    //    calls super(message), and stores the amount
    //  - Have a getter: double getAmount()
    //  Define it as a static inner class here, or as a separate class in this package.
    private final double amount;

    public InsufficientFundsException(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
