package vehicles;

import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;

public class Car extends Vehicle {

    private Engine engine;

    public Car(String make, String model, double price, String colour, Alloy alloys, Tyre tyres, Engine engine) {
        super(make, model, price, colour, alloys, tyres);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
