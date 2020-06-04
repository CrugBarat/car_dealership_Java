package vehicle_components;

public abstract class Component {

    private String brand;
    private String model;
    private int warranty;

    public Component(String brand, String model, int warranty) {
        this.brand = brand;
        this.model = model;
        this.warranty = warranty;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
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

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
