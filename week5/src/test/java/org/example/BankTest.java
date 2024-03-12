package org.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class BankTest extends TestCase {
    private Bank bank;
    private Customer customer;

    @Before
    public void setUp() {
        bank = new Bank();
        customer = new Customer("Melike Tlf");
    }

    @Test
    public void testCreateAccount() {
        Account account = bank.createAccount(customer, 200.0);
        Assert.assertNotNull(account);
        Assert.assertEquals(200.0, account.checkBalance(), 0.001);
    }

    @Test
    public void testRetrieveAccount() {
        bank.createAccount(customer, 200.0);
        Account retrievedAccount = bank.retrieveAccount(customer.getName());
        Assert.assertNotNull(retrievedAccount);
        Assert.assertEquals(200.0, retrievedAccount.checkBalance(), 0.001);
    }

}