package vehicle_components;

public class Battery extends Component {

    private String type;
    private int capacity;

    public Battery(String brand, String model, int warranty, String type, int capacity) {
        super(brand, model, warranty);
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
