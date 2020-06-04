package vehicles;

import org.junit.Before;
import org.junit.Test;
import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine, engine2;
    Alloy alloy, alloy2;
    Tyre tyre, tyre2;

    @Before
    public void before(){
        engine = new Engine("BMW","S14B25", 36, 2.5, 238, 240);
        engine2 = new Engine("BMW","M40B18", 36, 2.0, 208, 190);
        alloy = new Alloy("ENKEI","RS05RR", "18x8.5", 4, 12, "black");
        alloy2 = new Alloy("BORBET","AE", "7.5x20", 4, 12, "silver");
        tyre = new Tyre("Continental","PremiumContact", "17", 4, 6, "winter");
        tyre2 = new Tyre("Dunlop","SPORT MAXX RACE 2", "18", 4, 12, "summer");
        car = new Car("BMW", "E30", 24999.50,"black", alloy, tyre, engine);
    }

    @Test
    public void hasMake(){
        assertEquals("BMW", car.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("E30", car.getModel());
    }

    @Test
    public void hasPrice(){
        assertEquals(24999.50, car.getPrice(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("black", car.getColour());
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasAlloys(){
        assertEquals(alloy, car.getAlloys());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyre, car.getTyres());
    }

    @Test
    public void canSetMake(){
        car.setMake("Fiat");
        assertEquals("Fiat", car.getMake());
    }

    @Test
    public void canSetModel(){
        car.setModel("500");
        assertEquals("500", car.getModel());
    }

    @Test
    public void canSetPrice(){
        car.setPrice(20495.75);
        assertEquals(20495.75, car.getPrice(), 0.01);
    }

    @Test
    public void canSetColour(){
        car.setColour("Silver");
        assertEquals("Silver", car.getColour());
    }

    @Test
    public void canSetEngine(){
        car.setEngine(engine2);
        assertEquals(engine2, car.getEngine());
    }

    @Test
    public void canSetAlloys(){
        car.setAlloys(alloy2);
        assertEquals(alloy2, car.getAlloys());
    }

    @Test
    public void canSetTyres(){
        car.setTyres(tyre2);
        assertEquals(tyre2, car.getTyres());
    }

    @Test
    public void carCanBeDamged() {
        car.damage(2000);
        assertEquals(22999.50, car.getPrice(), 0.01);
    }
}
