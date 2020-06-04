package vehicle_components;

public class Component {

    private String brand;
    private String model;
    private int quantity;
    private int warranty;

    public Component(String brand, String model, int quantity, int warranty) {
        this.brand = brand;
        this.model = model;
        this.quantity = quantity;
        this.warranty = warranty;
    }
}
