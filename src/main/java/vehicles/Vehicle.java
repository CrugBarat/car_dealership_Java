package vehicles;

import behaviours.IDamage;
import vehicle_components.Alloy;
import vehicle_components.Tyre;

public abstract class Vehicle implements IDamage {

    private String make;
    private String model;
    private double price;
    private String colour;
    private Alloy alloys;
    private Tyre tyres;

    public Vehicle(String make, String model, double price, String colour, Alloy alloys, Tyre tyres) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.colour = colour;
        this.alloys = alloys;
        this.tyres = tyres;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this. model;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public Alloy getAlloys() {
        return this.alloys;
    }

    public Tyre getTyres() {
        return this.tyres;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setAlloys(Alloy alloys) {
        this.alloys = alloys;
    }

    public void setTyres(Tyre tyres) {
        this.tyres = tyres;
    }

    public void damageCost(double cost) {
        this.price -= cost;
    }
}
