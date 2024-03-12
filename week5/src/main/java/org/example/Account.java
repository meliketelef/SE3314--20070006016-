package org.example;

/**
 * Account class for bank operations.
 */
public class Account {
    private Customer customer;
    private double balance;

    /**
     * Constructs an Account with a customer and initial balance.
     *
     * @param customer the account holder
     * @param balance the initial balance
     */
    public Account(Customer customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    /**
     * Deposits money into the account.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount the amount to withdraw
     * @return true if the withdrawal was successful, false otherwise
     */
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Checks the balance of the account.
     *
     * @return the current balance
     */
    public double checkBalance() {
        return balance;
    }

}
