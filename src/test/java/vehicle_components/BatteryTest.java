package vehicle_components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatteryTest {

    Battery battery;

    @Before
    public void before(){
        battery = new Battery("A123Systems","MY", 36, "Lithium iron phosphate", 22);
    }

    @Test
    public void hasBrand(){
        assertEquals("A123Systems", battery.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("MY", battery.getModel());
    }

    @Test
    public void hasWarranty(){
        assertEquals(36, battery.getWarranty());
    }

    @Test
    public void hasType(){
        assertEquals("Lithium iron phosphate", battery.getType());
    }

    @Test
    public void hasCapacity(){
        assertEquals(22, battery.getCapacity());
    }

    @Test
    public void canSetBrand(){
        battery.setBrand("Samsung");
        assertEquals("Samsung", battery.getBrand());
    }

    @Test
    public void canSetModel(){
        battery.setModel("BT1625");
        assertEquals("BT1625", battery.getModel());
    }

    @Test
    public void canSetWarranty(){
        battery.setWarranty(24);
        assertEquals(24, battery.getWarranty());
    }

    @Test
    public void canSetType(){
        battery.setType("Nickel Metal Hydride");
        assertEquals("Nickel Metal Hydride", battery.getType());
    }

    @Test
    public void canSetCapacity(){
        battery.setCapacity(40);
        assertEquals(40, battery.getCapacity());
    }

}
