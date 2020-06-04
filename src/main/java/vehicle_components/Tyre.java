package vehicle_components;

public class Tyre extends Component {

    private String weather;

    public Tyre(String brand, String model, String dimensions, int quantity, int warranty, String weather) {
        super(brand, model, dimensions, quantity, warranty);
        this.weather = weather;
    }

    public String getWeather() {
        return this.weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }
}
