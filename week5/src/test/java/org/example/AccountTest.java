package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest extends TestCase {
    @Test
    public void testDeposit() {
        Customer customer = new Customer("Melike Tlf");
        Account account = new Account(customer, 100.0);
        account.deposit(50.0);
        Assert.assertEquals(150.0, account.checkBalance(), 0.001);
    }

    @Test
    public void testWithdraw() {
        Customer customer = new Customer("Melike Tlf");
        Account account = new Account(customer, 100.0);
        Assert.assertTrue(account.withdraw(50.0));
        Assert.assertEquals(50.0, account.checkBalance(), 0.001);
    }
}

