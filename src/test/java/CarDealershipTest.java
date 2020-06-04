import org.junit.Before;
import org.junit.Test;
import users.Customer;
import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarDealershipTest {

    CarDealership carDealership;
    Car car;
    Customer customer;

    @Before
    public void before() {
        carDealership = new CarDealership("Arnold Clark", 100000.0);
        Engine engine = new Engine("BMW", "S14B25", 36, 2.5, 238, 240);
        Alloy alloy = new Alloy("ENKEI", "RS05RR", "18x8.5", 4, 12, "black");
        Tyre tyre = new Tyre("Continental", "PremiumContact", "17", 4, 6, "winter");
        car = new Car("BMW", "e30",24999.50, "black", alloy, tyre, engine);
        customer = new Customer("Jane Doe", 40000.0);
    }

    @Test
    public void hasName() {
        assertEquals("Arnold Clark", carDealership.getName());
    }

    @Test
    public void hasTill() {
        assertEquals(100000.0, carDealership.getTill(), 0.01);
    }

    @Test
    public void carCollectionStartsAtZero() {
        assertEquals(0, carDealership.getCarCollectionSize());
    }

    @Test
    public void canSetName() {
        carDealership.setName("Reg Vardy");
        assertEquals("Reg Vardy", carDealership.getName());
    }

    @Test
    public void canSetCash() {
        carDealership.setTill(50000.0);
        assertEquals(50000.0, carDealership.getTill(), 0.01);
    }

    @Test
    public void canAddCar() {
        carDealership.addCar(car);
        assertEquals(1, carDealership.getCarCollectionSize());
    }

    @Test
    public void canRemoveCar() {
        carDealership.addCar(car);
        carDealership.removeCar(car);
        assertEquals(0, carDealership.getCarCollectionSize());
    }

    @Test
    public void canAddCash() {
        carDealership.addCash(8000);
        assertEquals(108000, carDealership.getTill(), 0.01);
    }

    @Test
    public void canRemoveCash() {
        carDealership.removeCash(10000);
        assertEquals(90000, carDealership.getTill(), 0.01);
    }

    @Test
    public void canBuyCar() {
        carDealership.buyCar(car);
        assertEquals(75000.5, carDealership.getTill(), 0.01);
        assertEquals(1, carDealership.getCarCollectionSize());
    }

    @Test
    public void canSellCar() {
        carDealership.addCar(car);
        carDealership.sellCar(car);
        assertEquals(124999.5, carDealership.getTill(), 0.01);
        assertEquals(0, customer.getCarCollectionSize());
    }

    @Test
    public void canBuyCarFromCustomer() {
        customer.addCar(car);
        carDealership.buyCarFromCustomer(car, customer);
        assertEquals(75000.50, carDealership.getTill(), 0.01);
        assertEquals(1, carDealership.getCarCollectionSize());
        assertEquals(0, customer.getCarCollectionSize());
    }

    @Test
    public void canSellCarToCustomer() {
        carDealership.addCar(car);
        carDealership.sellCarToCustomer(car, customer);
        assertEquals(124999.50, carDealership.getTill(), 0.01);
        assertEquals(0, carDealership.getCarCollectionSize());
        assertEquals(1, customer.getCarCollectionSize());
    }

    @Test
    public void canRepairAVehicle() {
        car.damage(4999.50);
        carDealership.repair(car, 2999.50);
        assertEquals(22999.50, car.getPrice(), 0.01);
    }
}
