package vehicle_components;

public class Alloy extends Component {

    private String colour;

    public Alloy(String brand, String model, String dimensions, int quantity, int warranty, String colour) {
        super(brand, model, dimensions, quantity, warranty);
        this.colour = colour;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
