package vehicles;

import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;

public class Vehicle {

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
}
