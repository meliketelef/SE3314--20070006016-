package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CustomerTest extends TestCase {

    @Test
    public void testName() {
        Customer customer = new Customer("Melike Tlf");
        Assert.assertEquals("Melike Tlf", customer.getName());
    }
}