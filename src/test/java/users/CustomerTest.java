package users;

import org.junit.Before;
import org.junit.Test;
import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before
    public void before() {
       customer = new Customer("Jane Doe", 40000.0);
       Engine engine = new Engine("BMW", "S14B25", 36, 2.5, 238, 240);
       Alloy alloy = new Alloy("ENKEI", "RS05RR", "18x8.5", 4, 12, "black");
       Tyre tyre = new Tyre("Continental", "PremiumContact", "17", 4, 6, "winter");
       car = new Car(24999.50, "black", engine, alloy, tyre);
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

    @Test
    public void canAddCar() {
        customer.addCar(car);
        assertEquals(1, customer.getCarCollectionSize());
    }

    @Test
    public void canRemoveCar() {
        customer.addCar(car);
        customer.removeCar(car);
        assertEquals(0, customer.getCarCollectionSize());
    }
}
