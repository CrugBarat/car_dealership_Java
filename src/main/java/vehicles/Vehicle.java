package vehicles;

import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;

public abstract class Vehicle {

    private double price;
    private String colour;
    private Engine engine;
    private Alloy alloys;
    private Tyre tyres;

    public Vehicle(double price, String colour, Engine engine, Alloy alloys, Tyre tyres) {
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.alloys = alloys;
        this.tyres = tyres;
    }

    public double getPrice() {
        return this.price;
    }

    public String getColour() {
        return this.colour;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Alloy getAlloys() {
        return this.alloys;
    }

    public Tyre getTyres() {
        return this.tyres;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setAlloys(Alloy alloys) {
        this.alloys = alloys;
    }

    public void setTyres(Tyre tyres) {
        this.tyres = tyres;
    }
}
