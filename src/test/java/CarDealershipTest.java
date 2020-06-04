import org.junit.Before;
import org.junit.Test;
import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;
import vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarDealershipTest {

    CarDealership carDealership;
    Car car;

    @Before
    public void before() {
        carDealership = new CarDealership("Arnold Clark", 100000.0);
        Engine engine = new Engine("BMW", "S14B25", 36, 2.5, 238, 240);
        Alloy alloy = new Alloy("ENKEI", "RS05RR", "18x8.5", 4, 12, "black");
        Tyre tyre = new Tyre("Continental", "PremiumContact", "17", 4, 6, "winter");
        car = new Car("BMW", "e30",24999.50, "black", alloy, tyre, engine);
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
        assertEquals(75000.50, carDealership.getTill(), 0.01);
        assertEquals(1, carDealership.getCarCollectionSize());
    }

    @Test
    public void canSellCar() {
        carDealership.addCar(car);
        carDealership.sellCar(car);
        assertEquals(124999.50, carDealership.getTill(), 0.01);
        assertEquals(0, carDealership.getCarCollectionSize());
    }
}
