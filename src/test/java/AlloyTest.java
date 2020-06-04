import org.junit.Before;
import org.junit.Test;
import vehicle_components.Alloy;

import static org.junit.Assert.assertEquals;

public class AlloyTest {

    Alloy alloy;

    @Before
    public void before(){
        alloy = new Alloy("ENKEI","RS05RR", 4, 12);
    }

    @Test
    public void hasBrand(){
        assertEquals("ENKEI", alloy.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("RS05RR", alloy.getModel());
    }

    @Test
    public void hasQuantity(){
        assertEquals(4, alloy.getQuantity());
    }

    @Test
    public void hasWarranty(){
        assertEquals(12, alloy.getWarranty());
    }

    @Test
    public void canSetBrand(){
        alloy.setBrand("BORBET");
        assertEquals("BORBET", alloy.getBrand());
    }

    @Test
    public void canSetModel(){
        alloy.setModel("AE");
        assertEquals("AE", alloy.getModel());
    }

    @Test
    public void canSetQuantity(){
        alloy.setQuantity(5);
        assertEquals(5, alloy.getQuantity());
    }

    @Test
    public void canSetWarranty(){
        alloy.setWarranty(24);
        assertEquals(24, alloy.getWarranty());
    }

}
