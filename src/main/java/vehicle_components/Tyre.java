package vehicle_components;

public class Tyre extends Component {

    private String weather;
    private String dimensions;
    private int quantity;

    public Tyre(String brand, String model, String dimensions, int quantity, int warranty, String weather) {
        super(brand, model, warranty);
        this.weather = weather;
        this.dimensions = dimensions;
        this.quantity = quantity;
    }

    public String getWeather() {
        return this.weather;
    }

    public String getDimensions() {
        return this.dimensions;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
