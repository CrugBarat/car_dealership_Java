package vehicle_components;

public class Alloy extends Component {

    private String colour;
    private String dimensions;
    private int quantity;

    public Alloy(String brand, String model, String dimensions, int quantity, int warranty, String colour) {
        super(brand, model, warranty);
        this.colour = colour;
        this.dimensions = dimensions;
        this.quantity = quantity;
    }

    public String getColour() {
        return this.colour;
    }

    public String getDimensions() {
        return this.dimensions;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
