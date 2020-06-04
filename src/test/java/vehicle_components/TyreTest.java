package vehicle_components;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Continental","PremiumContact", "17", 4, 6, "winter");
    }

    @Test
    public void hasBrand(){
        assertEquals("Continental", tyre.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("PremiumContact", tyre.getModel());
    }

    @Test
    public void hasDimensions(){
        assertEquals("17", tyre.getDimensions());
    }

    @Test
    public void hasQuantity(){
        assertEquals(4, tyre.getQuantity());
    }

    @Test
    public void hasWarranty(){
        assertEquals(6, tyre.getWarranty());
    }

    @Test
    public void hasWeather(){
        assertEquals("winter", tyre.getWeather());
    }

    @Test
    public void canSetBrand(){
        tyre.setBrand("Dunlop");
        assertEquals("Dunlop", tyre.getBrand());
    }

    @Test
    public void canSetModel(){
        tyre.setModel("SPORT MAXX RACE 2");
        assertEquals("SPORT MAXX RACE 2", tyre.getModel());
    }

    @Test
    public void canSetDimensions(){
        tyre.setDimensions("18");
        assertEquals("18", tyre.getDimensions());
    }

    @Test
    public void canSetQuantity(){
        tyre.setQuantity(5);
        assertEquals(5, tyre.getQuantity());
    }

    @Test
    public void canSetWarranty(){
        tyre.setWarranty(12);
        assertEquals(12, tyre.getWarranty());
    }

    @Test
    public void canSetWeather(){
        tyre.setWeather("summer");
        assertEquals("summer", tyre.getWeather());
    }
}
