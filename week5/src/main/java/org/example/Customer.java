package org.example;

/**
 * Customer class for bank customers.
 */
public class Customer {

    private String name;

    /**
     * Constructs a new Customer with a name.
     *
     * @param name the name of the customer
     */
    public Customer(String name) {
        this.name = name;
    }

    /**
     * Retrieves the name of the customer.
     *
     * @return the name of the customer
     */
    public String getName() {
        return name;
    }
}
