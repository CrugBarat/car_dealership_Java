package vehicle_components;

public class Component {

    private String brand;
    private String model;
    private String dimensions;
    private int quantity;
    private int warranty;

    public Component(String brand, String model, String dimensions, int quantity, int warranty) {
        this.brand = brand;
        this.model = model;
        this.dimensions = dimensions;
        this.quantity = quantity;
        this.warranty = warranty;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getDimensions() {
        return this.dimensions;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getWarranty() {
        return this.warranty;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
