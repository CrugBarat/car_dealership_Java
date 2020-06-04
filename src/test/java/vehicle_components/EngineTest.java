package vehicle_components;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("BMW","S14B25", "95.0x87.0", 1, 36, 2.5, 238, 240);
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
    public void hasLitres(){
        assertEquals(2.5, engine.getLitres(), 0.01);
    }

    @Test
    public void hasPower(){
        assertEquals(238, engine.getPower());
    }

    @Test
    public void hasTorque(){
        assertEquals(240, engine.getTorque());
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
        engine.setDimensions("105.0x95.0");
        assertEquals("105.0x95.0", engine.getDimensions());
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

    @Test
    public void canSetLitres(){
        engine.setLitres(2.2);
        assertEquals(2.2, engine.getLitres(), 0.01);
    }

    @Test
    public void canSetPower(){
        engine.setPower(222);
        assertEquals(222, engine.getPower());
    }

    @Test
    public void canSetTorque(){
        engine.setTorque(200);
        assertEquals(200, engine.getTorque());
    }
}
