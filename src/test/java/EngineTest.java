import org.junit.Before;
import org.junit.Test;
import vehicle_components.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("BMW","S14B25", "95.0x87.0", 1, 36);
    }

    @Test
    public void hasBrand(){
        assertEquals("BMW", engine.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("S14B25", engine.getModel());
    }

    @Test
    public void hasDimensions(){
        assertEquals("95.0x87.0", engine.getDimensions());
    }

    @Test
    public void hasQuantity(){
        assertEquals(1, engine.getQuantity());
    }

    @Test
    public void hasWarranty(){
        assertEquals(36, engine.getWarranty());
    }

    @Test
    public void canSetBrand(){
        engine.setBrand("BMW ALPINA");
        assertEquals("BMW ALPINA", engine.getBrand());
    }

    @Test
    public void canSetModel(){
        engine.setModel("C1");
        assertEquals("C1", engine.getModel());
    }

    @Test
    public void canSetDimensions(){
        engine.setModel("105.0x95.0");
        assertEquals("105.0x95.0", engine.getModel());
    }

    @Test
    public void canSetQuantity(){
        engine.setQuantity(0);
        assertEquals(0, engine.getQuantity());
    }

    @Test
    public void canSetWarranty(){
        engine.setWarranty(24);
        assertEquals(24, engine.getWarranty());
    }
}
