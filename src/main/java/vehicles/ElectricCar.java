package vehicles;

import vehicle_components.Alloy;
import vehicle_components.Battery;
import vehicle_components.Tyre;

public class ElectricCar extends Vehicle {

    private Battery battery;

    public ElectricCar(String make, String model, double price, String colour, Alloy alloys, Tyre tyres, Battery battery) {
        super(make, model, price, colour, alloys, tyres);
        this.battery = battery;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }
}
