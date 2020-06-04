package vehicles;

import vehicle_components.Alloy;
import vehicle_components.Battery;
import vehicle_components.Engine;
import vehicle_components.Tyre;

public class Hybrid extends Vehicle{

    private Engine engine;
    private Battery battery;

    public Hybrid(double price, String colour, Alloy alloys, Tyre tyres, Engine engine, Battery battery) {
        super(price, colour, alloys, tyres);
        this.engine = engine;
        this.battery = battery;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public Battery getBattery() {
        return this.battery;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
