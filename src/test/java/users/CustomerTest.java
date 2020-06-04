package users;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void before() {
       customer = new Customer("Jane Doe", 40000.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jane Doe", customer.getName());
    }

    @Test
    public void hasCash() {
        assertEquals(40000.0, customer.getCash(), 0.01);
    }

    @Test
    public void carCollectionStartsAtZero() {
        assertEquals(0, customer.getCarCollectionSize());
    }

    @Test
    public void canSetName() {
        customer.setName("John Smith");
        assertEquals("John Smith", customer.getName());
    }

    @Test
    public void canSetCash() {
        customer.setCash(10000.0);
        assertEquals(10000.0, customer.getCash(), 0.01);
    }
}
