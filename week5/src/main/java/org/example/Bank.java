package org.example;


import java.util.HashMap;
import java.util.Map;

/**
 * Bank class for managing accounts and customers.
 */
public class Bank {

        private Map<String, Account> accounts = new HashMap<>();

        /**
         * Creates an account for a customer.
         *
         * @param customer the customer for whom the account is created
         * @return the created account
         */
        public Account createAccount(Customer customer, double initialDeposit) {
            Account account = new Account(customer, initialDeposit);
            accounts.put(customer.getName(), account);
            return account;
        }

        /**
         * Retrieves an account by the customer's name.
         *
         * @param name the name of the customer
         * @return the account associated with the customer name
         */
        public Account retrieveAccount(String name) {
            return accounts.get(name);
        }
    }


