package vehicles;

import vehicle_components.Alloy;
import vehicle_components.Engine;
import vehicle_components.Tyre;

public class Car extends Vehicle {

    public Car(double price, String colour, Engine engine, Alloy alloys, Tyre tyres) {
        super(price, colour, engine, alloys, tyres);
    }
}
